package com.java.class40;

import java.io.FileNotFoundException;

public class ExceptionHandling {

    // Compile Exception - You need to handle it compulsory using try catch, or you can also use throws keyword to warn other methods


    // runtime Exception - compiler doesn't;t complain when statements throwing. Run time exception, It's not compulsory to handle
    public static void main(String[] args) {

    }

    public static void method2 () throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("Hello! you got exception");
    }
}
