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

