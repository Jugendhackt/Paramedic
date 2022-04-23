from django.shortcuts import render, redirect
from django.http import HttpResponse
from django.core import serializers

import requests

from paramedic.backend import models

def new_acciedent_lts(request):
    if request.method == "POST":
        models.LTS_Meldung(location_lat=123.0,location_long=123.0,).save()
        print(request.body.decode("utf-8").split("\n"))
        return HttpResponse(request)
    else:
        redirect("/")


def index(request):
    print(request)
    return render(request, "index.html")

def app(request):

    if request.user.is_authenticated:
        url = "https://nina.api.proxy.bund.dev/api31/mowas/mapData.json"

        payload = ""
        response = requests.request("GET", url, data=payload)

        state = {
            "nina": response,
            "username" : request.user.username
        }
        print(response.content)

        return render(request, "app/index.html", state)

    else: 
        return redirect("/login")