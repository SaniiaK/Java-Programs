package com.java.class05;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner Saniia = new Scanner (System.in);

        System.out.println("User name: ");
        String word1 = Saniia.nextLine();

        System.out.println("Enter Password: ");
        String word2 = Saniia.nextLine(), word3;

        word3 = word2;
        word2 = word1;
        word1 = word3;

        System.out.println(word1);
        System.out.println(word2);
    }
}
