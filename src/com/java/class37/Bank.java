package com.java.class37;

public abstract class Bank {
    int balance;

    public void checkBalance (){
        System.out.println(balance);
    }

    public void withdraw (int amount ){
        balance = balance - amount;
        System.out.println("Available balance - " + balance);
    }


    // What this method do, but we don't know how we do it

    public abstract void displayRateOfInterest();
}
// Abstract classes can only be extended to the child classes, that the only point of abstract classes.
// if we have at least one method abstract, class has to be abstract (abstract classes are incomplete classes that's why we can't create object)
// All the parent classes by design have to be abstract classes
