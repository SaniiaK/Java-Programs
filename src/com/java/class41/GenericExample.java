package com.java.class41;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(); // we can not use primitive data lik int, that's why we need to use object of Integer class
        Box<String> StringBox = new Box<>();
        intBox.setDate(10);
        StringBox.setDate("Chirag");
        System.out.println(intBox.getDate());



        System.out.println(intBox.getDate());
        System.out.println(StringBox.getDate());
    }
}
