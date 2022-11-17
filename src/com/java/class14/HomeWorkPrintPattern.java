package com.java.class14;
//3. Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6
public class HomeWorkPrintPattern {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 10;

        while ( num1 <= 5 && num2 <=10){
            System.out.print( " " + num1 + " " + " " + num2 + " ");
            num1++;
            num2--;
        }

        for (int i = 1, j =10; i <= 5; i++, j--){// we don't need any condition for J because I is controlling the number of  executions
            System.out.println(i);
            System.out.println(j);
        }

        // Another Approach

        System.out.println("=====================");
        for ( int i = 1; i <= 5; i++){
            System.out.println(i);
            System.out.println(11 - i);


        }

    }

}
