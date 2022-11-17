package com.java.class21;

import java.util.Scanner;

public class Practice1 {
    //count number of spaces

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
        String reverse = "";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            reverse = reverse + str.charAt(str.length() - 1 - i);

            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("White spaces" + count);

        str = str.replace(" ", "");
        reverse = reverse.replace(" ", "");

        if (str.equals(reverse)) {
            System.out.println("String " + reverse + " is Palindrome");
        } else {
            System.out.println("String " +reverse + " is Not Palindrome");

        }


        for ( int line = 1; line<=5; line++){
            for ( int space=1; space<=5-line; space++){
                System.out.print(" ");
            }
            System.out.println();

            for ( int col = line ; col <= 5; col++){
                System.out.print("&");
        }


        }

    }
}
