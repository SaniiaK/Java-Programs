package com.java.class35;

import com.sun.javafx.image.impl.General;

import java.util.Scanner;

public class Demo {
    public static void main (String []args ){
        Patient patient = new generalPatient();
        patient.takeTylenol();
        Patient child = new childPatient();
        child.takeTylenol();
        Patient senior = new seniorPatient();
        senior.takeTylenol();
        Patient disabled = new disabledPatient();
        disabled.takeTylenol();

        System.out.println(patient.payBill(1000, 300));
        System.out.println(child.payBill(1000, 300));
        System.out.println(senior.payBill(1000,300));
        System.out.println(disabled.payBill(1000,300));
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();
//calculate payments

        //ask a user for it's age
        //if the age is less than 10 y.o create childPatient
        //if the age is more or equal to  10 and less than 60 y.o create generalPatient
        //if the age is more or equal to  60  y.o create seniorPatient
        //ask the user to enter their balance
        //ask how much they want to pay
        //apply their discount if applicable
        //return their remaining balance

        System.out.println("What is your balance");
        double balance = scanner.nextDouble();

        System.out.println("how much do want to pay?");
        double amountReceived = scanner.nextDouble();
//what dymanic polymorphism?
        //you can decide what object to initialize during the runtime
        //the Parent class variable should be able to hold any of the child class objects
        //this helps to write the logic once.

        Patient patient1;

        if (age<10){

            patient1=new childPatient();
        } else if (age < 60) {
            patient1 = new generalPatient();
        }else {
            patient1= new seniorPatient();
        }

        //double remainingBalance = patient.payBill(original,amountRecieved);
       // System.out.println("your remaining balance is " + remainingBalance);


    }
}
