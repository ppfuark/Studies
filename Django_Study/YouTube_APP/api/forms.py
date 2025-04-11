from django import forms
from .models import YoutubeVideo

class YoutubeVideoForm(forms.ModelForm):
    class Meta:
        model = YoutubeVideo
        fields = ['name', 'url']