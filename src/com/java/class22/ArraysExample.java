package com.java.class22;

public class ArraysExample {
    // Arrays - Container to hold more than one values of SIMILAR data types
    public static void main(String[] args) {
        //Declaration of arrays
        int data [];//Declaration will not initialize size in memory

        int a ; //4 bytes
            //Initialize the array
        //Important - In Java when we want to initialize variable that can hold collection
        // of values we need to use new keyword
        data=new int[5];

        //Declaration and Initialization in same line
        int salary[]=new int [1000000000]; // We don't know values, so we initialize with max capacity
        // Array is fixed and cant be changed, that's the drawback from array

        //Declaration and assignment in the same line
        int nums []={10, 20, 30, 34, 45,23,45,23,12,65,23};// we know values, we can assign fixed set of numbers


        // Length of the Array
        System.out.println(nums.length);// total elements are 11
        // index will start with 0 and gives us 10 not 11

        /// Print value at particular index
        System.out.println(nums[4]);

        // Print all data from array

        for (int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        // Print default value of element of array

        System.out.println(salary[45]);


        System.out.println(nums);


    }
}
