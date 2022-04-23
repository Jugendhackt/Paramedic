from django.shortcuts import render, redirect
from django.http import HttpResponse
from django.core import serializers

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
        state = {
            "username" : request.user.username
        }
        response = render(request, "app/index.html", state)
        response["Access-Control-Allow-Origin"] = "*"
        return response

    else: 
        return redirect("/login")