package com.java.class36;

import com.java.class35.Subclass;

public class TestInterfaces {
    public static void main(String[] args) {

        FirstInterface i = new Subclass();
        // Dynamic polymorphism - you don't know what type of object you are going to create in advance
         // you can choose what type  of object to create during runtime

        i.play();


        // where to use static variables vs instance variables
        // Instance variables -> characteristics (attributes) of Objects
        // if you want the info to be unique for each Object use instance variables

        // if you have a piece of info that doesn't belong to any object
        // piece of info that's just an info that about anyone, anybody,



    }
}
