package com.java.class12;

import java.util.Scanner;

public class HomeWorkOddOrEvenWithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num = sc.nextInt();
        OddOrEvenNumber(num);


    }
    static void OddOrEvenNumber(int a){
        if (a%2 ==0){
            System.out.println( a + " is even number");
        }else {
            System.out.println(a + " is odd number");
        }
    }
}
