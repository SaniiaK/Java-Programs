package com.java.Practice;

import java.util.Scanner;

public class GreatestNumber{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your time: ");
        int time1 = sc.nextInt();
        System.out.println("Please enter your time: ");
        int time2 = sc.nextInt();
        System.out.println("Please enter your time: ");
        int time3 = sc.nextInt();

        if (time1 > time2){
            if (time1 > time3){
                System.out.println( time1+ " greatest");
            }else {
                System.out.println(time3 + " greatest");
            }
        }else{
            if (time2 > time3){
                System.out.println(time2 + " greatest");
            }else{
                System.out.println(time3 + " greatest");
            }
        }


    }
}
