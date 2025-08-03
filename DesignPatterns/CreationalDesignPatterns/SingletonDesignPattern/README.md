In certain situations, such as managing a database connection, logging or configuration settings, we want to ensure that only one instance of the class is created throughout the application's life cycle.

For example, let's say you have a class called as logger(), this logger to write logs in a text-file.
An objects of this logger class is created Logger L1;
And ideally there should be only one such object.
Suppose by mistake two such objects are created(L1 and L2) which are going to write to this text file.
It's there could be several problems.
For example there could be problem like a concurrent write right, so one logger may write the output of other write,
secondly, as a use case, second logger object is not required
But since logger is a class, many objects of this class can be created.

This is where the singleton design pattern comes into picture.

Multiple instances at times can lead to issues like - 
1. Inconsistent States - If multiple instances represent the same concept, they may hold different data
2. Resource conflicts - If multiple instances of a resource-heavy class are created, it can lead to performance degradation

Eg2- 
Lets say there is a class APiSettings which has a field APIKey.
If there are two objects which has values of APIKey as A1 and A2 resp, it will lead to problems. There is certain data like configuration settings in which can be stored in just one object. We do not need to create multiple config objects for this app.

When to use - 
1. Global Resource Management(eg. managing database connections, logging etc)
2. Configuration setting in applications that needs to be shared
