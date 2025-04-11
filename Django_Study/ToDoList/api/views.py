from django.shortcuts import render, get_object_or_404, redirect
from django.http import HttpResponseRedirect
from .models import ToDoList, Item
from .forms import CreateNewList
from django.contrib.auth.decorators import login_required

@login_required
def index(request, id):
    todo_list = get_object_or_404(ToDoList, id=id)

    if request.method == "POST":
        if request.POST.get("save"):
            for item in todo_list.item_set.all():
                # Evitar valores indesejados com o get() do POST
                if request.POST.get('c'+str(item.id)) == 'clicked':
                    item.complete = True
                else:
                    item.complete = False
                item.save()

        elif request.POST.get("newItem"):
            new_item_text = request.POST.get("new")
            if len(new_item_text) > 1:
                todo_list.item_set.create(text=new_item_text, complete=False)
            else:
                print(f"Invalid: {new_item_text}") 

    return render(request, "api/list.html", {"todo_list": todo_list})
    
def home(request):
    todo_lists = ToDoList.objects.all()
    return render(request, "api/home.html", {"todo_lists": todo_lists})

@login_required
def create(request):
    if request.method == "POST":
        form = CreateNewList(request.POST)
        if form.is_valid():
            name = form.cleaned_data['name']
            new_list = request.user.todolist_set.create(name=name)
            return redirect("list", id=new_list.id)
    else:    
        form = CreateNewList()

    return render(request, "api/create.html", {"form": form})
