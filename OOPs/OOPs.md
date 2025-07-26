Object Oriented Programming is a programming model based on objects and data.
It makes the code more flexible, reusable and easier to maintain.

*********************************************************************************************************

4 Pillars of OOPs
1. Abstraction
2. Inheritance
3. Encapsulation
4. Polymorphism


Class - A blueprint containing a set of attributes and behaviours that define an item
Object - An instance of a class
Eg. Tree Class - 
Attributes - Height, Trunk Diameter, Tree Type -> all trees will have these properties but their values might differ
Behaviour - Growing -> An action that tree takes
A class doesn't need to have attributes or behaviours. It can be completely empty or just have attributes or just have behaviours or both
firsTree with certain values for its attributes is an object.

Non-static Members - A part of class that is accessible with an instance and belongs to that instance also called instance members.
You need to create an instance to access these members

Static Memebers - A part of the class that is accessible to the class and belongs to the class. It should be an attribute or a method that is not based on a particular instance. It belongs to all the instances of a class.

*********************************************************************************************************

Encapsulation - 
Bind state and behaviour together in a single unit
Wrapping/combining data and code acting on that data together

Benefits -
    1. Prevents classes from tightly coupled, i.e modify the inner working of one class without affecting the rest of the program
    2. Clear pathways for classes to communicate
    3. Less code change required for refactoring change
    4. With more restriction, less likely an attribute to be overwritten with an invalid or null value unexpectedly

Requires Restriction - 
    Requires a clear interface b/w a given class and the rest of the program
    Everything can't have direct access

Class's attributes can be made hidden from other classes using encapsulation. Data will still be accessible but only idirectly through the methods of the class

Encapsulation can be achieved by access modifiers
Access Modifiers - Allows to determine where certain variables and methods can be accessed in the code
Private - only visible in the class that the member lives in
No modifier - visible in the package it lives in
Protected - visible to the package and all subclasses
Public - accessible everywhere within the program

*********************************************************************************************************

Inheritance -
Classes inherit properties of other classes.

Subclass/Child class - the class which inherits the properties
Superclass/Parent class - the class which is inherited from

Eg.
Employee class - name, Id, salary attributes/behaviours
SalesPerson class - name, Id, salary + commission attributes/behaviours -> Employee + commision attributes/behaviours

Benfits -
    1. Avoids duplication
    2. Additions or modification to super class will automatically affect subclasses
    3. Promotes code reusability and scalability

It is Is-A Relationship -> The Salesperson is an Employee.
All Salesperson instances are also Employee
Not all Employees instances are Salespersons

Inheritance can be applied in many different ways
Single-level Inheritance -> 
    One superclass has one subclass
        One superclass(Employee) -> One subclass(Salesperson)
    One parent class has many subclasses
        One superclass(Employee) -> Multiple subclasses(Salesperson, Analyst)
Hierarchical Inheritance ->
    A subclass act as superclass for another one
        Superclass(Person) -> Subclass(Employee) -> Subclasses(Salesperson, Analyst)
Some other inheritances -> Mutliple and Hybrid(Not supported in java) -> can cause unnecessary complexity

Keyword to achieve inheritence is extends

*********************************************************************************************************

Polymorphism-
The ability for an object or function to take many different forms
Java supports both run-time and compile-time polymorphism

Benefits
    1. Reduces complexity
    2. Makes code more reusable
    3. Make code more flexible by providing multiple ways to use similar functionality

Compile-Time Polymorphism (Static Binding)
🔹 AKA: Method Overloading
Method call is resolved at compile time.
Same method name, different parameter lists (type or count).
Decided based on reference type and argument types.
| Feature     | Compile-Time Polymorphism |
| ----------- | ------------------------- |
| Binding     | Happens at compile time   |
| Speed       | Faster                    |
| Flexibility | Less (static behavior)    |

Run-Time Polymorphism (Dynamic Binding)
🔹 AKA: Method Overriding
Method call is resolved at runtime, based on the actual object type.
Subclass overrides a method of the parent class.
Enables dynamic behavior.
| Feature     | Run-Time Polymorphism                   |
| ----------- | --------------------------------------- |
| Binding     | Happens at runtime                      |
| Speed       | Slower (due to dynamic dispatch)        |
| Flexibility | More (supports inheritance, interfaces) |

Compile-time polymorphism improves readability and convenience (e.g. multiple constructors).
Runtime polymorphism powers real-world OOP: flexible, modular, and extendable designs.


