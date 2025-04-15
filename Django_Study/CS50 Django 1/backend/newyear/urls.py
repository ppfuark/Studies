from django.urls import path
from . import views

app_tasks = 'newyear'
urlpatterns = [
    path('', views.index, name='index')
]