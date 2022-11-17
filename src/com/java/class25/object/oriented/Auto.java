package com.java.class25.object.oriented;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Auto {
    String car;
    String carModel;
    int year;
    double expenses;
    String color;
    double carTax;

    void CarTax (double price, double tax){

        tax=price*tax;
        System.out.println("Car tax is $" + tax);
    }
    void CarTotalPrice ( double price, double tax){
        tax=price*tax;
        price =price+tax;
        System.out.println("Car total price is $" + price);
    }

    void setCarDetails (String carModel, String color, int year){
        System.out.println("This car is " + carModel + "," + color + " and year model " +year );
    }


    }

