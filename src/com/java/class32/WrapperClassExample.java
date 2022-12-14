package com.java.class32;

public class WrapperClassExample {
    public static void main(String[] args) {
        int i =10;
        Integer j = i; // wrapping means to convert from primitive to object
        System.out.println(j);



        /// Use of Wrapper Class - To convert String to int & int to String

        String str1 = "Learn Java";
        String str2 = "46";



        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        System.out.println(String.valueOf(j)); // String value of j
    }
}
