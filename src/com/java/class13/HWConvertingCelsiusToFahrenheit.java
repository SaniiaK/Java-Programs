package com.java.class13;

import java.util.Scanner;
// Write a program to take a temperature from the user in celsius and convert it into Fahrenheit  using the method
public class HWConvertingCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input temperature in Celsius = ");
        double b;
        b = sc.nextDouble();
        double a = convertingCelsiusToFahrenheit(b);

        System.out.println( " Temperature in Fahrenheit = " + a);



    }
    static double convertingCelsiusToFahrenheit(double a){
        a = (a * 1.8) + 32;
        return a;

    }
}
