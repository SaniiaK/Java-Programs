package com.java.class04;

public class StringExample {
    public static void main(String[] args) {

        String str1 = "Hello"; // str variable, "Hello" is a value
        String str2 = "Everyone";

        System.out.println(str1 + str2); // will print the variable value of str1 and str2. It will combine the value - Concatenation
        // if we need space we can simply add space in the string "Hello + space " or "Space + Everyone"

        int num1 = 10;
        int num2 = 20;

        double d = 10.1;
        System.out.println(str1 + num1); // We can concatenate with integer as well
        System.out.println(str1 + num1 + num2); // THe print out will be "Hello1020"
        System.out.println(num1 + num2 + str1); // Addition and then concatenation "30 Hello"
        System.out.println(str1 + (num1 + num2)); // Hello30
        System.out.println(str1 + num1 * num2);// Hello200
       System.out.println(str1 + num1 + num2 + str2); // Hello1020Everyone
//        System.out.println(str1 + num1 -num2); // we cant do subtraction with the string
        System.out.println(num1 + "num2" + str1); // it will print 10num2Hello
        // to make comment we can use CTRL / for Windows and Comand / for Mac
        // CTRL Z to reverse - go back
        // (/* - */) to select multiple lines





    }
}
