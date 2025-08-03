Creational Design Patterns - 
Focused upon object creation mechanisms, aiming to optimize the creation process while ensuring flexibility.

Goal - To abstract the instantiation process(the process of creation of objects) to make systems more flexible and reusable.

Problems solved - 
Prevent tight coupling b/w code and object creation logic, simplifying the management of new object creation, especially in complex systems
Eg. A client which is responsible for object creation, won't do that directly. Instead a new layer will be added which does the object creation

Eg - 
In a system where different type of documents(PDF, word or Excel) are created, instead of using new everywhere, a factory Pattern can centralize the object creation.

Applications - Applied in scenarios where-
1. You want to separate the creation of object from the usage.
2. The exact type of object needed can vary depending on runtime conditions.
