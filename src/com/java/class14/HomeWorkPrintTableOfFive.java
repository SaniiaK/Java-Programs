package com.java.class14;

import java.util.Scanner;
//================== Homework 18th Oct ===================
//1. Write a program to print a table of 5
//Output
//1 * 5  = 5
//2 * 5  = 10
//3 * 5  = 15
//4 * 5  = 20
//5 * 5  = 25
//6 * 5  = 30
//7 * 5  = 35
//8 * 5  = 40
//9 * 5  = 45
//10 * 5 = 50

public class HomeWorkPrintTableOfFive {
    public static void main(String[] args) {
        int i = 1;
        int a =5;

        while (i <= 10){
            System.out.println(i + " * " + a + " = " + (a * i));
            i++;
        }



    }
}
