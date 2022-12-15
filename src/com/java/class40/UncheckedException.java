package com.java.class40;

import java.io.IOException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) throws IOException {

        try {
            openBrowser();
        }catch (IOException e){
            System.out.println("You have entered invalid browser");
        }

    }

    public static void openBrowser() throws IOException {
        Scanner sc = new Scanner(System.in);
        String browser = sc.nextLine();
        if (browser.equals("Chrome")) {
            System.out.println("Opening Chrome");
        } else if (browser.equals("Firefox")) {
            System.out.println("Opening Firefox");
        } else {
            throw new IOException("Invalid Browser") ;

        }
    }
}