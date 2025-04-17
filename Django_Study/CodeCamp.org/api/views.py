from django.http import HttpResponse
from django.shortcuts import render

from .models import Product
from .forms import ProductForm

def index(req, *args, **kwargs):
    return HttpResponse(f"<h1>This app is Working!</h1><p>{args}</p><p>{kwargs}</p>")

def render_index(req, *args, **kwargs):
    return render(req, "api/home.html", {'args': args, 'kwargs': kwargs, 'req': req})

def product_get(req):
    products = Product.objects.all()
    return render(req, 'api/list_products.html', {'products': products})

def product_create(req):
    form = ProductForm(req.POST or None)
    if form.is_valid():
          