package com.java.class31;

import com.java.class32.Car;

public class AccessModifierExampleFromClass32Car {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(500);
        System.out.println(c.getSpeed());
    }

}
