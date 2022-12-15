package com.java.class38;

public class Finally {
    public static void main(String[] args) {
        try {

            int a[] = {12, 23, 45};
            System.out.println(a[2]);
        }catch (Exception e) {
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Nice to see you");
        }
    }

}
