from django.http import HttpResponse
from django.shortcuts import render

def hello(request):
    return HttpResponse(f"Hello!")

def index(request, name):
    return render(request, 'api/index.html', {
        'name':name.capitalize()
    })