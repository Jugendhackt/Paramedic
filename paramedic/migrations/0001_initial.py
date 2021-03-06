# Generated by Django 4.0.4 on 2022-04-23 19:12

from django.db import migrations, models
import django.db.models.deletion
import paramedic.backend.models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Institutions',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=100)),
                ('insitution_type', models.IntegerField(choices=[(1, 'Fire_dep'), (2, 'First_responder'), (3, 'paramedics')])),
            ],
        ),
        migrations.CreateModel(
            name='LTS_Meldung',
            fields=[
                ('uuid', models.UUIDField(default=paramedic.backend.models.LTS_Meldung.generate_uuid, primary_key=True, serialize=False, unique=True)),
                ('location_lat', models.FloatField()),
                ('location_long', models.FloatField()),
                ('wer', models.CharField(max_length=200)),
                ('was', models.CharField(max_length=200)),
                ('wie_viele', models.CharField(max_length=200)),
                ('additional_information', models.CharField(max_length=300)),
            ],
        ),
        migrations.CreateModel(
            name='Vehicles',
            fields=[
                ('uuid', models.UUIDField(primary_key=True, serialize=False, unique=True)),
                ('emg_vehicles', models.IntegerField(choices=[(1, 'HLF'), (2, 'MTW'), (3, 'DLK'), (4, 'TLF'), (5, 'LF'), (6, 'RTW'), (7, 'KTW'), (8, 'NEF')])),
                ('passengers', models.IntegerField()),
                ('water_capacity', models.FloatField()),
                ('patient_capacity', models.IntegerField()),
                ('current_status', models.IntegerField(choices=[(1, 'Einsatzbereit'), (2, 'frei Funk'), (3, 'Anfahrt'), (4, 'Einsatzort'), (5, 'Sprechwunsch'), (6, 'nicht Einsatzbereit')])),
                ('current_alarm', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='paramedic.lts_meldung')),
                ('institution', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='paramedic.institutions')),
            ],
        ),
    ]
