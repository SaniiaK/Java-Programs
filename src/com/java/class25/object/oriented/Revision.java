package com.java.class25.object.oriented;

public class Revision {
    public static void main(String[] args) {


        // Operation on 2D array
        // Declare 2D array
        int data[][] = new int[5][5]; //5by5
        int data1[][] = {{23, 23}, {45, 23}, {23, 34}, {45, 56}};//4by2

        // Find number of rows in the array
        //

        // Find number of colum
        //System.out.println(data[i].length);

        //Print all the elements of 2D array
        // for (int i=0; i < data.length; i++){


        // Using for each loop print all the data

        for (int num []: data1) {
            for (int i : num) {

                System.out.print(" " + i);
            } System.out.println();
        }



    }
}
