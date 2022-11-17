package com.java.class22;

public class FindIndexOfNumber {
    // Write a program to find index of the number
    public static void main(String[] args) {
        int data []= { 12, 34, 56, 23, 76, 33, 74, 32, 21};
        int targetNum=56;
        System.out.println(findIndex(data,targetNum));
    }
    static int findIndex (int [] data, int targetNUmber) {
        int num=0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetNUmber) {
                num= i;
            }
        }
       return num;
    }

}
