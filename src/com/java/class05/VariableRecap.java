package com.java.class05;

public class VariableRecap {
    public static void main(String[] args) {
        /* int a = 10, b = 20;
        int c = 10;
        int d = 20;
        //Declaration of variable
        int a;
        // Assigning value to the variable
        a = 10;
        a = 20;

        //Declaration and initialization
        int b = 20;

        // Declaring multiple variables in the same line of same datatype
        int c, d=10, e;
        System.out.println(a,b,c,d,e);
    }*/
        int a = 10, b = 20, c; //  a  , b =10 , c
        //a = 20; // how to swap the value of a into b and b into a we can use a = b
        //b = 10;

        c = a; // c = 10 //  c = a // a = 30
        a = b; // a = 20 // b = c // c = 10
        b = c; // b = 10  //

        System.out.println(a);
        System.out.println(b);


    }
}