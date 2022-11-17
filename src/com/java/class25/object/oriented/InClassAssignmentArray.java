package com.java.class25.object.oriented;


public class InClassAssignmentArray {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";
       String words []= str.split(" ");
        for ( int i =0; i < str.length(); i++)
            System.out.println(words[i] + " - " + words[i].length());


        for (String word : words){
            System.out.println(word+ " = " + word.length());
        }

    }
}
