package com.java.class25.object.oriented;

public class MainClassCar {
    public static void main(String[] args) {

        Auto car = new Auto();
        String auto = "Toyota";
        String carModel="Camry";
        int yearModel =2022;
        double expenses =35000.10;
        String color = "Red";
        double tax = 0.2510;


        car.setCarDetails(carModel,color,yearModel);
        car.CarTax(expenses,tax);
        car.CarTotalPrice(expenses,tax);


    }
}
