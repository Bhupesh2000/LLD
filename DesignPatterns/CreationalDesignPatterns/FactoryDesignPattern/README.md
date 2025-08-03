There is a transportation service app where users can request different types of transport vehicles like a car, a bus or a bike.
So now whenever a vehicle is requested, an object is created of that particular vehicle.
Car car = new Car();
Bike bike = new bike();

But as the system involves managing object creation directly like this, it's going to become complex, especially when adding new types of vehicles.

So basically there is a app which wants to request vehicles okay.
It says, I want to get a vehicle like a vehicle like a car.
So instead of doing getVehicle("car"), let's say it does the object creation It creates explicit objects of one of the vehicle types.
Basically this app or this service, it's going to become complicated as new vehicles are going to get added.

So factory method can be used in this case. It can do something like this -> getVehicle("car").
It can abstract out the process of object creation from the service which is requesting the vehicles.

Problem Statement - 
An interface Transport which will have multiple implementations - car, bike, bus etc.
There is a TransportService(client app). The object creation is managed by TransportService for now

Problems with the above code - 
1. The client code(i.e TransportService), it is tightly coupled to the concrete classes(Bike, Car, Bus). So if a new kind of vehicle needs to created the client has to create a new object for that
2. Adding new transport type requires modyfing the client code which is the violation of Open/closed principal

So the solution is to use factory pattern
It helps to centralize the creation logic and delegate the responsibility of creating objects to factory classes, which decides class to instantiate(i.e which object to create). This allows the code to follow open closed principle by letting new type of vehicles be added without modifying the existing code.
To handle the above problem the idea is to add a new Factory class(TransportFactory), that contains the logic to create different type of transport based on the input string. This abstracts the creation logic and makes it easier to add or change the transport types.

Advantages of the above solution is-
1. Decoupling - The client code no longer needs to know the details of how car, bike etc objects are created. It simply calls the factory method
2. Flexibility - Adding a new transport only requires modifying the factory, not the client code.

Real world use cases - 
1. GUI Framework - When the type of button or widget to be created is determined at the runtime based on the platfor(Windows, macOS, linux)
2. Database Configuration - When choosing different type of databases(eg. SQL, NoSQL) based on configuration.
3. Document Conversion Tools - When the type of file(like PDF, Word, Excel etc) to be created depends upon user input or settings. 