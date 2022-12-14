package com.java.class35;

public class childPatient extends Patient{
    @Override
    public void takeTylenol() {
        System.out.println("Recommended dosage for a child patient is 5ml ");

    }

    @Override
    public double payBill(double original, double amountReceived) {
        double discount = 0.1;
        return original - (original*discount) - amountReceived;
    }
    }
