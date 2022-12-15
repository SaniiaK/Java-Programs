package com.java.class38;

import java.io.File;
import java.io.FileInputStream;

public class CheckedAndUncheckedException {
    public static void main(String[] args) {

        try {
            FileInputStream fs = new FileInputStream(new File("")); // compiler exception, checked exception
        }catch (Exception e){

        }
    }
}
