package com.java.class26;

public class Car {
    int speed;
    String color;
    // Pass by value
    void drive(){
        System.out.println("Driving " + color + " car at speed " + speed);
    }
    //Pass by value
    int increaseSpeed(int speed){
        speed=speed+500;
        return speed;
    }
    //Pass by reference/address
    void decreaseSpeed(Car myCar){
        myCar.speed = myCar.speed - 200;
    }

    void makeSpeedZero(){
        speed = 0;
    }

}
