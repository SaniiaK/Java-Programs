package com.java.class21;

import java.util.Scanner;

//============= Homework 02 Nov =============
//Java Program to count the total number of vowels and consonants in a string
//Example
//Input - Today is Saturday
//Output - Total Vowels - 6, Total Consonants -  9

public class HWNumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Today is Saturday");
        String str = sc.nextLine();
        int countVowel=0;
        int countConst=0;

        for ( int i=0; i < str.length(); i ++){
            char vowel=str.charAt(i);
            if ( vowel== 'a' || vowel =='e' || vowel== 'i' || vowel== 'o' || vowel=='u'){
                countVowel++;
            } else if (vowel!=' ') {
                countConst++;
            }

        }System.out.println("Number of vowels " + countVowel + " and " + "number of consonants " + countConst);




    }
}
