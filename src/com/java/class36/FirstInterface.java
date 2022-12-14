package com.java.class36;
//Interface jut like an abstract class can not be instantiated
//interface can not be marked final => because the whole point of Interface to be Implemented (extended)
// can not be declared private or protected


// why do we need interfaces?
// Interfaces are needed to tell the subclasses what they must do
// but not how to do it
// Interfaces are very similar to abstract classes
// but the biggest difference is that abstract classes can have characteristics (instance variables)
//Whereas in interfaces you only have behaviours (methods)
// plus abstract classes can also have non-abstract methods that are common to all sub-classes

public interface FirstInterface {
    // in abstract classes you have to declare the method abstract explicitly
    // whereas in interfaces methods are by default public and abstract
    // and one of the best coding practices is to remove redundant code

   public abstract void play();




}


// implicitly - when things happen in the background (hidden way )Implicit = its automatically there
//
// explicitly - when you have to do it manually (open way ) Explicit = you have to do it