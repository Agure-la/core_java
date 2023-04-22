     

In Java, inheritance is the mechanism by which a subclass can inherit the properties and methods of its superclass. Class A is a super class, which means it is a parent class from which other classes inherit properties and methods. Class B is a subclass of A, which means it inherits all properties and methods of class A, and may have additional properties and methods of its own. Similarly, class C is a subclass of B, which means it inherits all properties and methods of both class A and class B, and may have additional properties and methods of its own.

In this scenario, we have three classes: A, B, and C. Class A is the super class, while B and C are sub classes of A.

Each class has two methods that are specific to it. These methods are unique to each class, and are not inherited by any of the other classes. In addition to the two unique methods, each class also has a third method that is overridden. This means that the method has the same name and parameters in all three classes, but each class provides its own implementation of the method.

Overriding methods allows a subclass to provide a specific implementation of a method that is already provided by its parent class. This is useful when a method in the parent class is almost what a subclass needs, but not quite. The subclass can then override the method to provide its own implementation that is more specific to its needs. 

         TASKS
    A, B and C are classes
    A is a super class. B is a sub class of A. C is a sub class of B.
     2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
