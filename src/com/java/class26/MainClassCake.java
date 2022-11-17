package com.java.class26;

public class MainClassCake {
    public static void main(String[] args) {

        Cake ck = new Cake();
        Cake ck1= new Cake ("Sponge", 1);

        ck.ingredients="flour";
        ck.tools= "Whisker";




        ck.mixIngredients(ck.ingredients, ck.tools );

    }
}
