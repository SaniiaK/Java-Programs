package com.java.class08;

import java.util.Scanner;


public class HomeWork4 {
    public static void main (String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch = userInput.next().charAt(0);

       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
           System.out.println(" Your character is vowel");
       }else {
           System.out.println(" Your character is not vowel");
       }

    }
}
