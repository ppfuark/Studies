# <span style="color:rgb(182, 82, 248); font-weight: bold;">Types</span>

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Dictionary</span>
- Doesn't check if the data is the correct type or structure.

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Typed Dictionary</span>
- Provides type safety.
- Makes debugging easier.

```python
from typing import TypedDict

class Movie(TypedDict):
    name: str
    year: int

movie = Movie(name="Film name", year=2000)
```

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Union</span>
- Provides type safety.
- Flexible for multiple types.

```python
from typing import Union

def square(x: Union[int, float]) -> float:
    return x * x

x = 5
x = 1.34
x = "This will fail - It's a str"
```

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Optional</span>
- Indicates a value that can either be of a specific type or `None`.

```python
from typing import Optional

def nice_message(name: Optional[str]) -> None:
    if name is None:
        print("Hello random person!")
    else:
        print(f"Hello {name}!")
```

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Any</span>
- Can be of any type. Avoid when type safety is important.

```python
from typing import Any

def value(x: Any):
    print(x)

value("AAAAAAAAAA")
value(7)
```

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Lambda Function</span>
- A quick way to define small, anonymous functions.

```python
square = lambda x: x * x
square(10)
```

```python
nums = [1, 2, 3, 4]
squares = list(map(lambda x: x * x, nums))
```
</br>
</br>
</br>

# <span style="color:rgb(182, 82, 248); font-weight: bold;">Elements</span>

## <span style="color:rgb(213, 151, 255); font-weight: bold;">Nodes</span>
- **Nodes** are individual functions or operations that perform specific tasks within the graph.  
- Each node receives input (often the current state), processes it, and produces an output or an updated state.  

**Analogy:**  
**Assembly Line Stations**: Each station does one job—attach a part, paint it, inspect quality, and so on.  

---  

## <span style="color: rgb(213, 151, 255); font-weight: bold;">State</span>
- The **State** is a shared data structure that holds the current information or context of the entire application.  
- It acts as the application's memory, tracking variables and data that nodes can access and modify during execution.  

**Analogy:**  
**Whiteboard in a Meeting Room**: Participants (nodes) write and read information on the whiteboard (state) to stay updated and coordinate actions.  

---  
## <span style="color: rgb(213, 151, 255); font-weight: bold;">Graph</span>
- A **Graph** in LangGraph is the overarching structure that maps out how different tasks (nodes) are connected and executed.  
- It visually represents the workflow, showing the sequence and conditional paths between various operations.  

**Analogy:**  
**City Metro Map**: Stations (nodes) are connected by routes (edges), with different lines (conditional paths) determining how you travel between them.  

---  

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Edge</span>
- A **Edge** are the connections between nodes that determine the flow of executation.  

**Analogy:**  
**Train Tracks**: Each track(Edge) connects the stations(nodes) together in a specific direction.  

---  

## <span style="color: rgb(213, 151, 255); font-weight: bold;">Conditional Edges</span>
- A **Conditional Edges** are specialized connections 
that decide the next node to execute based on specific conditions or logic applied to the current state. 

**Analogy:**  
**Traffic Lights**: Green means go one way, red 
means stop, yellow means slow down. The condition (light color) decides the next step..  