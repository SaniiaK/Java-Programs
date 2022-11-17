package com.java.Practice;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

                                        // String Method 1 "Compare"
        String str1 = "Hello Saniia";
        String str2 = "Hello";
        String str3 = "Hello Saniia";
        String str4 = "Today is friday November 4 2022";
        String title = "Hello %s Welcome to %s ";
        String name = "Sami";
        String web = "Amazon";

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//
//                                   //String Method 2 "=="
//
//        System.out.println(str1==str3);

                                    //String Method 3 "Contains"

        System.out.println(str2.contains(str3));

                                  //String Method 4 "To Upper Case"

        System.out.println(str1.toUpperCase());


                                 //String Method 5 "To lower case"

        System.out.println(str3.toLowerCase());

                                //String Method 6 "Character at particular index"

        System.out.println(str4.charAt(6));

                                //String Method 6 "Index of particular character"

        System.out.println(str4.toLowerCase().indexOf('n'));

                                //String Method 7 "Split"
        System.out.println(str4.split(" "));


                    //         //String Method 8 "Format"
        System.out.println(String.format(title,name,web));

                                //String Method 9 "Length of string"
        int i=5;

        System.out.println(title.length());

                         //String Method 9 "Format "
        System.out.println(title.replace("%s", name));

                        // String method 10 "Trim" trimming spaces before and after String
        System.out.println(str4.trim());

                        //String method 11 "Last character of string"

        System.out.println(str2.lastIndexOf('o'));

                        //String method 12 "Substring"

        System.out.println(title.substring(0,10));

                            //String 13 method "Is Empty"
        String namee = " ";
        System.out.println(namee.isEmpty());

                            // String 14 method "replace"

        System.out.println(str4.replace("friday", "Safia"));

                        // String 15 method " isBlank"
        //System.out.println(st1.isBlank);

        System.out.println(str2.length());







    }
}