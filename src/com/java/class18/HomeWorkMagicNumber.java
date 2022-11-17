package com.java.class18;

public class HomeWorkMagicNumber {
    public static void main(String[] args) {
        for ( int a =1; a<=100; a++){
            if (a%5==4 && a%4==3 && a%3==2 && a%2==1){
                System.out.println(" Magic Number is: " + a);
            }
        }
    }
}
