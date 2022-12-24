package com.java.class44;

public class RegexExample {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.matches("^[a-zA-Z]+$"));

        String title2 = "USD 200";
        System.out.println(title2.replaceAll("[^0-9]","")); // don't replace 0-9, just remove
    }
}
