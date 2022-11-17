package com.java.class23;

public class TwoDimensionArray {
    public static void main(String[] args) {

        //Declaration of 2D array
        int data[][];

        // Declaration and initialization of 2D array

        int nums [][]= new int [3][3];

        //declare and assign in one line

        int info [][] ={{23, 44, 21}, {45, 42, 31}, {73, 14, 0}};


        // Finding number of rows int the array
        System.out.println(nums.length);

        // Find number of column in row

        System.out.println(nums[0].length);

        // Print data of particular index

        System.out.println(nums[1][1]);

        // Print al dat from 2d array using index based for loop

        for (int i=0; i< info.length; i++){
            for (int j=0; j < info[i].length; j++){
                System.out.print(info[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
