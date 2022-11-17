package com.java.class13;

public class ReturnExample {
    public static void main(String[] args) {
        int a = 10;
        changeValue(a); // result is not stored int a if it was a = changeValue then it would change
        System.out.println(a);
    }
    static int changeValue( int a){
        a = a + 5;
        return a;
    }
}
