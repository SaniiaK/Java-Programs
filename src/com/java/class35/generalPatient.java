package com.java.class35;

public class generalPatient extends Patient {
    @Override
    public void takeTylenol() {
        System.out.println("Your recommended dosage is 250 mg ");
    }

    @Override
    public double payBill(double originalBalance, double amountRecieved ) {

        amountRecieved=originalBalance-amountRecieved;

        return amountRecieved;
    }
}
