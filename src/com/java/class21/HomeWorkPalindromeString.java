package com.java.class21;
////3. Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
////Example
////Input - Was it a car or a cat I saw
////Output - Palindrome (edited)
public class HomeWorkPalindromeString {

    public static void main(String[] args) {
        String str ="Was it a car or a cat I saw";
        String reverseStr="";
        String newStr = str.replace(" ", "");

        for ( int i =str.length()-1; i >=0; i--){

            reverseStr=reverseStr+str.charAt(i);
            reverseStr=reverseStr.replace(" ", "");

            }
        System.out.println(newStr.toLowerCase());
        System.out.println(reverseStr.toLowerCase());
            if ( newStr.equalsIgnoreCase(reverseStr) ){
                System.out.println("Palindrome");
            }else {
                System.out.println("Not Palindrome");
            }







    }
}
