package com.java.class35;

public class disabledPatient extends Patient {
    @Override
    public void takeTylenol() {
        System.out.println("Recommended dosage for a disabled patient is 200mg ");

    }

    @Override
    public double payBill(double original, double amountReceived) {
        double discount = 0.2;
        return original - (original*discount) - amountReceived;
    }


}
