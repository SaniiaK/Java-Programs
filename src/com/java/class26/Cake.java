package com.java.class26;

public class Cake {
    String ingredients;
    String tools;
    int spatula;
    int whisker = 1 ;
    String cakeType;
    int quantityOfCake;
    int pan;
    String panShape;
    String cakeMix;
    int degree;


    Cake (){
        System.out.println("Hello, glad to see you are planning to make a cake");
        System.out.println("let's start baking!!!");
    }

    Cake (String cakeTypeFromUser,int numOfCakeFromUser){
        cakeType=cakeTypeFromUser;
        quantityOfCake=numOfCakeFromUser;
        System.out.println("You want to make " + quantityOfCake + " " + cakeType + "cake(s)");
    }

    void mixIngredients(String ingredients, String tools){
        System.out.println("Let's get all the ingredients and start mixing them");
        System.out.println("you will need " + ingredients + " and " + whisker + " " + tools);
        cakeMix=ingredients+whisker;
    }


    void preheatOven (String oven, int degree){
        System.out.println("Preheat " + oven + " till " + degree);

    }

    void bakeCakeMix(){
        System.out.println("Take " + pan + " and " + panShape + " pan and pour " + cakeMix + " into pan and place in the oven");
    }

}
