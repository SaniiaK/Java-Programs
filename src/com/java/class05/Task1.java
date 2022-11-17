package com.java.class05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner glass = new Scanner  (System.in);

        System.out.println("Milk");
        String a = glass.nextLine();

        System.out.println("Tea");
        String b = glass.nextLine(), c;

        c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);
    }
}

