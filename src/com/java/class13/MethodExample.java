package com.java.class13;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(getMultiplicaton(10,20));
        System.out.println(call ("John"));



    }
    static int getMultiplicaton(int a, int b){
//        System.out.println(a*b);
        int result = a * b;
        return a * b;
    }

    static String call(String phoneNumber) {
        System.out.println("Calling ...." + phoneNumber);
        return " calling";
    }

    static void text(String phoneNumber, String text){
        System.out.println("Sending text to " + phoneNumber);
    }
}
