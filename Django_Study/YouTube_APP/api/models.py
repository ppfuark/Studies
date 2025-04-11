import re
from django.db import models

class YoutubeVideo(models.Model):
    name = models.CharField(max_length=100)
    url = models.CharField(max_length=255)

    def __str__(self):
        return self.name

    @property
    def embed_url(self):
        regex = r"(?:v=|be/)([a-zA-Z0-9_-]{11})"
        match = re.search(regex, self.url)
        if match:
            return f"https://www.youtube.com/embed/{match.group(1)}"
        return self.url
