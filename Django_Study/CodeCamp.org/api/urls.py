from django.urls import path
from . import views

urlpatterns = [
    path("", views.index, name='index'),
    path('render_index', views.render_index, name='render_index'),
    
]