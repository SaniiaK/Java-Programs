package com.java.class38;

import java.awt.*;

public class ExceptionExampleTwo {
    public static void main (String [] args){
        String str =null; // NUll point exception, it means it doesn't exist anywhere
        System.out.println(str.length());

        try {

            int a[] = {12, 23, 45};
            System.out.println(a[3]);
        }catch (Exception e) {
            System.out.println("Something went wrong");
        }
        try{
            String str1 = "null";
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}
