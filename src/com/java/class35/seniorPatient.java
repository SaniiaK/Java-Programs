package com.java.class35;

public class seniorPatient extends Patient {
    @Override
    public void takeTylenol() {
        System.out.println("Recommended dosage for a senior patient is 500 mg ");




    }

    @Override
    public double payBill(double original, double amountReceived) {
        double discount = 0.4;
        return original - (original*discount) - amountReceived;
    }


}
