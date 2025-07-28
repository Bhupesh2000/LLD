Solid Principals are set of five design principles in object oriented programming and software design.
The goal of these principles is to make the software more understandable, flexible and maintainable by following a structured approach.

S - Single Responsibility Principal(SRP)
O - Open/Closed Principal(OCP)
L - Liskov Substitution Principal(LSP)
I - Interface Segregation Principal(ISP)
D - Dependency Inversion Principal(DIP)

********************************************************************************************************************************************

Single Responsibility Principal(SRP)
A class should have only one reason to change, meaning it should have only one responsibility
Eg. - If creating a user class, it should only have data/operations related to user.
If lets say a different kind of operation like saving user to database or sending email, this should not be done in User class. There should be different classes like UserRepository and NotificationService resp. to handle this. User should only handle methods like creating users or setting their properties etc.
So the work should be split across different classes and each class should have different responsibity.

********************************************************************************************************************************************

Open/Close Principal(OCP)
Software entities(classes, modules, functions) should be open for extension but closed for modification.
Eg. Adding new functionality to a system using inheritance or composition without modification.
Making modification in already tested code can lead to potential bugs and errors in our code.
So adding new classes or functions is fine and should not touch the previous written code unless exteremly required.
OCP can be achieved using inheritance or composition