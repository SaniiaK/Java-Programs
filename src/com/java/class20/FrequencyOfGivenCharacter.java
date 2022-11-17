package com.java.class20;
// Write a program to find frequency of given character
// the String

import javax.swing.plaf.IconUIResource;

// String - Hello, How are you?
//Character -e
//output -2
public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Hello, How are you Elsa?";
        char target = 'e';
        int count =0;
        for ( int i=0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i)==target){
                count++;
            }
    }
        System.out.println(count);

    }
}
