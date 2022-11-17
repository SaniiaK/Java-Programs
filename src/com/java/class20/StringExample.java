package com.java.class20;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string: ");
        String str =sc.nextLine();
        int count = getNumberOfSpaces(str);
        if (count>=10){
            System.out.println("String is large");
        } else if (count>=5) {
            System.out.println("String is medium");
        }else {
            System.out.println("String is small");
        }


    }
    static int  getNumberOfSpaces (String str){
        int count =0;
        for (int i =0; i <str.length(); i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}
