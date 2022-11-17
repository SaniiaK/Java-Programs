package com.java.interview.question;

public class ForEachLoop {
    public static void main(String[] args) {
        int data1[][] = {{23, 23}, {45, 23}, {23, 34}, {45, 56}};//4by2
        for (int num []: data1) {
            for (int i : num) {

                System.out.print(" " + i);
            } System.out.println();
        }
    }
}
