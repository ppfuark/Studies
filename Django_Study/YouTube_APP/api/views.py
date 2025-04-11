from django.shortcuts import redirect, render
from .models import YoutubeVideo
from .forms import YoutubeVideoForm

def video_list(request):
    videos = YoutubeVideo.objects.all()
    return render(request, 'api/video_list.html', {"videos": videos})

def new_video(request):
    if request.method == "POST":
        form = YoutubeVideoForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('video_list')
    else:
        form = YoutubeVideoForm()
    return render(request, 'api/new_video.html', {'form': form})
