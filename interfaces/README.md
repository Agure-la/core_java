  
To create an interface in Java, use the interface keyword followed by the interface name.
An interface can have one or more abstract methods that must be implemented by the class that implements the interface.
An interface can also have default and static methods with implementations.
A class can implement one or more interfaces by using the implements keyword followed by the interface name(s).
An interface can extend one or more other interfaces using the extends keyword.
All the methods in an interface are by default public and abstract.
A class that implements an interface must implement all the abstract methods defined in the interface.
An interface can also have fields, which are by default public, static, and final.
Access modifiers like public, private, and protected cannot be used with interface fields, but they can be used with inner interfaces.
 
     TASK
   
1. Create an interface with only one method and implement it in a class. Call the method implemented.
2. Create an interface with two methods, but implement only one in a class. Call the method implemented.
3. Use Interface instances to call the implemented method in the implemented class
4. Create two interfaces with one method each. Implement these two interfaces in one class.
5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method.
6. Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and call the method.
7. Create an interface and inherit it from the other interface.
8. Create a PUBLIC interface with fields and methods, fields should have values assigned. Implement this interface to some class and print the values of the interface fields and call the interface methods
9. Create a PRIVATE or PROTECTED interface and print the values as above scenario
10. Create an interface with private, public and protected fields.
11. Create an interface with static final variable
