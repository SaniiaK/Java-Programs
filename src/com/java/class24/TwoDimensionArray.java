package com.java.class24;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int info [][]={
            {23,44,21},
            {45,42,31},
            {73,14,0}

        };



//        for (int i=0; i <info.length; i++){
//            for ( int j=0; j<info[2].length; j++){
//                System.out.print(info[i][j] +",");
//            }
//            System.out.println();
//        }



        for (int i=0; i < info.length; i++ ){

            int sum=0;
            
            for (int j=0; j < info[i].length; j++){

                sum =sum+info[i][j];
            }
            System.out.println(sum);


        }
        /// write a program to print the sum of each row from 2D array
    }









}
