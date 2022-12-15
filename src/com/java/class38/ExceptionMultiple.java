package com.java.class38;

public class ExceptionMultiple {
    public static void main(String[] args) {
        try {

            int a[] = {12, 23, 45};
            System.out.println(a[3]);

            String str = "null";
            System.out.println(str.length());
        }catch (Exception e){ // this catch has to be at the end
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        System.out.println("Nice to see you");

    }
}

