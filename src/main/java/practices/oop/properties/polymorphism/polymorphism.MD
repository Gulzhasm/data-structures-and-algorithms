Polymorphism

Poly -> many
morphism -> ways to represent

Polymorphism - act of representing the same thing in multiple ways

Types of polymorphism:

1. Compile time or STATIC polymorphism - this is achieved via method overloading!

   what is method overloading:
   Same name of a method, but types, arguments, return types, ordering can be different. For example, multiple
   constructors:
   A a = new A();
   A a2 = new A(3,4);

2. Runtime or DYNAMIC polymorphism - this is achieved by method overriding!

what is method overriding:
same function, but child class is overriding the parent's function. 

Parent obj = new Child(); -> which method will be called depends on Child(); This is known as UPCASTING! 
thus overriding works

early binding and late binding: 
Whenever you declare the class as final, it will implicitly declare all the methods in it

