#from typing_extensions import Required
from django.db import models
import uuid

class LTS_Meldung(models.Model):

    uudi = models.UUIDField(unique=True, primary_key=True, default=uuid.uuid4())
    
    location_lat = models.FloatField()
    location_long = models.FloatField()
    
    #date = models.DateField()
    #time = models.TimeField()

    #title = models.CharField(max_length=200)

    #name_person = models.CharField(max_length=100)
    #additional_information = models.CharField(max_length=300)



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


