package com.java.class04;

import java.sql.SQLOutput;

public class IfExample {
    // In Java we ahve 2 condiotional statements
    // if
    //  1. Simple if
    //  2. If .. else
    // 3.Ladder if else
    // 4.Nested if else
    // Switch
    public static void main(String[] args) {
        // syntax for the if statement is if(condition){ }
        int a = 12;
        System.out.println("1");
        if(a >= 11){
            System.out.println("2"); // we need curly brackets to write down more statements, without brackets we can only write one statement
            System.out.println("Two");
        }
        System.out.println("3");
    }
}
