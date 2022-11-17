package com.java.Practice;

import java.util.Scanner;

public class Math {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("choose any number between 1-100");
            int a = sc.nextInt();
            System.out.println("add the same number to that.....");

            System.out.println("multiply it by 6..... take ur time");

            System.out.println("u dont believe me but i do know the answer) type 'go' and ill show u the answer");
            String answer = sc.next();

            int result = ((a + a) * 6 / a);
            System.out.println(result);
        }
    }

