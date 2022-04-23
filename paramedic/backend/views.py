from django.shortcuts import render, redirect
from django.http import HttpResponse
from django.core import serializers
import json

import requests

from paramedic.backend import models

def new_acciedent_lts(request):
    if request.method == "POST":
        data = request.body.decode("utf-8").split("\n")
        models.LTS_Meldung(location_lat=data[0],location_long=data[1],wer=data[2],was=data[3],wie_viele=data[4],additional_information=data[5]).save()
        return HttpResponse("message send")
    else:
        redirect("/")


def index(request):
    return render(request, "index.html")

def app(request):

    if request.user.is_authenticated:
        url = "https://nina.api.proxy.bund.dev/api31/mowas/mapData.json"

        payload = ""
        try:
            response = requests.request("GET", url, data=payload)
        
            parsed_response = json.loads(response.content)
        

            list_response = []
            for alarm in parsed_response:
                list_response.append(alarm)
        except:
            print("error")
            parsed_response = []

        state = {
            "nina": parsed_response,
            "username" : request.user.username
        }
        print(response.content)

        return render(request, "app/index.html", state)

    else: 
        return redirect("/login")