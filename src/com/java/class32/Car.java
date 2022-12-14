package com.java.class32;

public class Car {

    private int speed;
    private String color;
    public Car (){
        System.out.println("From car constructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getters
    public int getSpeed(){
        // All your logic to identify the transaction log
        return speed;
    }
    //Setters
    public void setSpeed(int speed){
        this.speed = speed;

    }
}
