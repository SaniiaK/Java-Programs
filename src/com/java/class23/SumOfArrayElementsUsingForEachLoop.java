package com.java.class23;

public class SumOfArrayElementsUsingForEachLoop {
    public static void main(String[] args) {
        int data []={23, 44, 21, 23, 23 ,35, 35,23, 23, 44, 35};
        int sum=0;
        for (int num: data){
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
