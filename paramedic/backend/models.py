#from typing_extensions import Required
from django.db import models
import uuid
from django.db.models.signals import post_save
from django.dispatch import receiver
from paramedic.backend.consumer import AlarmConsumer
from channels.layers import get_channel_layer
from asgiref.sync import async_to_sync


class LTS_Meldung(models.Model):
    def generate_uuid():
        return uuid.uuid4()
    uuid = models.UUIDField(unique=True, primary_key=True, default=generate_uuid)
    
    location_lat = models.FloatField()
    location_long = models.FloatField()
    
    #date = models.DateField()
    #time = models.TimeField()

    wer = models.CharField(max_length=200)
    was = models.CharField(max_length=200)
    wie_viele = models.CharField(max_length=200)

    additional_information = models.CharField(max_length=300)


@receiver(post_save, sender=LTS_Meldung)
def trigger_alarm(sender, instance, created, **kwargs):
    print(instance.wer)
    channel_layer = get_channel_layer()
    async_to_sync(channel_layer.group_send)("alarm",     {
        "type": "send_update",
        "long": instance.location_long,
        "lat": instance.location_lat,
        "wer" : instance.wer,
        "was" : instance.was,
        "wie_viele" : instance.wie_viele,
        "anmerkungen" : instance.additional_information
    })
    #async_to_sync(channel_layer.send)("channel_name", {"test":"test"})


class Institutions(models.Model):
    name = models.CharField(max_length=100)
    insitution_type_choises = [
        (1, "Fire_dep"),
        (2, "First_responder"),
        (3, "paramedics")
    ]

    insitution_type = models.IntegerField(choices=insitution_type_choises)


class Vehicles(models.Model):
    emg_vehicles_choises = [
        (1, "HLF"),
        (2, "MTW"),
        (3, "DLK"),
        (4, "TLF"),
        (5, "LF"),
        (6, "RTW"),
        (7, "KTW"),
        (8, "NEF"),
    ]

    emergency_status_choises = [
        (1, "Einsatzbereit"),
        (2, "frei Funk"),
        (3, "Anfahrt"),
        (4, "Einsatzort"),
        (5, "Sprechwunsch"),
        (6, "nicht Einsatzbereit")
    ]

    uuid = models.UUIDField(unique=True, primary_key=True)


    emg_vehicles = models.IntegerField(choices=emg_vehicles_choises)
    passengers = models.IntegerField()
    
    water_capacity = models.FloatField()
    patient_capacity = models.IntegerField()

    current_status = models.IntegerField(choices=emergency_status_choises)
    current_alarm = models.ForeignKey(LTS_Meldung, on_delete=models.CASCADE)

    institution = models.ForeignKey(Institutions, on_delete=models.CASCADE)


