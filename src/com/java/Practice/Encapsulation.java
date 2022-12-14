package com.java.Practice;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {

        class A {

            private int id;
            private String name;

        } // Is this example of encapsulation ?

    }

    // What is encapsulation?

    // Why do we need encapsulation?

    // When do we use encapsulation?
    //Advantages of Encapsulation:
    //
    //Data Hiding: The user will have no idea about the inner implementation of the class. It will not be visible to the user that how the class is stored values in the variables. He only knows that we are passing the values to accessors and variables are getting initialized to that value.
    //Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our requirement. If we wish to make the variables as read-only then we have to only use Get Accessor in the code. If we wish to make the variables as write-only then we have to only use Set Accessor.
    //Reusability: Encapsulation also improves the re-usability and easy to change with new requirements.
    //Testing code is easy: Encapsulated code is easy to test for unit testing.
}
//