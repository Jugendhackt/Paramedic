from django.shortcuts import render, redirect
from django.http import HttpResponse
from django.core import serializers


def new_acciedent_lts(request):
    if request.method == "POST":
        
        print(request.body.decode("utf-8").split("\n"))
        return HttpResponse(request)
    else:
        redirect("/")


def index(request):
    print(request)
    return HttpResponse(request)