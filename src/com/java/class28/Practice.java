package com.java.class28;

import java.util.ArrayList;
import java.util.Arrays;

class Bakery{
    static String [] list = {"Danish", "Croissant", "Muffin"};
   ArrayList<String> sweetList = new ArrayList<>(Arrays.asList("Danish", "Croissant", "Muffin"));
    int quantity =0;

    Bakery(){
        System.out.println("=====Bakery=====");
        System.out.println("Hello from Bakery");
        //System.out.println(list.length);
        System.out.println("Please choose an item from the list " + sweetList);
    }

    void AddToBasket(){
        System.out.println(list[0]);
    }
}
class UpdatedBakery extends Bakery {
   UpdatedBakery(){
       System.out.println();
       System.out.println("=====Hello from UpdatedBakery=====");
       sweetList.add("Brownie");
       sweetList.add( 4, "PoundCake");
       System.out.println("Please choose from the updated list " + sweetList.get(4));
   }
}

class Cakes extends UpdatedBakery{
    Cakes(){
        System.out.println();
        System.out.println("=====Welcome to Cakes=====");
    }
}

class CustomCakes extends Bakery{
    CustomCakes(){
        System.out.println();
        System.out.println("=====Welcome to custom cakes=====");
    }
}

public class Practice {
    public static void main(String[] args) {
        Bakery item = new Bakery();
        item.AddToBasket();
        UpdatedBakery items = new UpdatedBakery();
        items.AddToBasket();
        Cakes cake = new Cakes();
        CustomCakes ck = new CustomCakes();




    }


}
