package com.java.class07;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers from 1-12:");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("31 days in Jan");
        } else if (num == 2) {
            System.out.println("28 days in Feb");
        } else if (num == 3) {
            System.out.println(" 31 days in Mar");
        } else if (num == 4) {
            System.out.println(" 30 days in Apr");
        } else if (num == 5) {
            System.out.println(" 31 days in May");
        } else if (num == 6) {
            System.out.println(" 30 days in June");
        } else if (num == 7) {
            System.out.println(" 31 days in July");
        } else if (num == 8) {
            System.out.println("31 days in August");
        } else if (num == 9) {
            System.out.println(" 30 days in Sept");
        } else if (num == 10) {
            System.out.println("31 days in Oct");
        } else if (num == 11) {
            System.out.println(" 30 days in Nov");
        } else if (num == 12) {
            System.out.println(" 31 days in Dec");
        }else if (num > 12){
            System.out.println("Invalid entry");
        }else {
            System.out.println("Error");
        }


    }
}