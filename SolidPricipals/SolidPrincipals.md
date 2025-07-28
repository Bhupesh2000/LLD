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

