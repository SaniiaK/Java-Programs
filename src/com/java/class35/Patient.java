package com.java.class35;

// abstract classes can not be instantiated, initialized directly
//this is good example for cases with BaseIphone and specific Iphones like Iphone 7
//abstract classes can not be final. -> what happens if the class is final ? => you cannot extend it. you can not change any values in it.
//Because the whole point of abstract classes is to be xtended
//abstract classes can not be marked private


public  abstract class Patient {


    // abstract methods do not have any implemintation
    // which means we know, and we require each child class to have takeTylenol method
    //and should write the specific logic to each child class
    public abstract void takeTylenol();


    // we want to create a method to inquire the payments
    // ChildPatients should be given 10% discount from original price
    //General Patients should pay in full
    //Seniors should be given 40% discount from original price
    // Disabled patients should be given 20% fee
    public abstract double payBill(double original, double amountReceived);



//Patient varP = new Patient();
//you declare variable, not an object.
//intialize -> new object, or value(literal values)
//12
//"gdg"
}
