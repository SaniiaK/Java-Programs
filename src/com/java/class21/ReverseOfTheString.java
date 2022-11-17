package com.java.class21;

import java.util.Scanner;

public class ReverseOfTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter full name");
        String name =sc.nextLine();

       for (int i =name.length()-1; i>=0; i--){
           System.out.println(name.charAt(i));
       }
// Another approach
        for ( int i =0; i < name.length(); i++){
            System.out.println(name.charAt(name.length()-1-i));
        }
    }
}
