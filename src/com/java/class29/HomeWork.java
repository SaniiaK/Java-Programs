package com.java.class29;

import java.util.ArrayList;
import java.util.Arrays;

class Animals {
    String item = "Cat";

    Animals(String str){
        this.WelcomeMssg();
        System.out.println("Thank you for choosing our store");
    }

    public void WelcomeMssg(){
        System.out.println();
        System.out.println("Hello this an animal store <Clever Pets> ");
        System.out.println();
    }
    public void ChooseYourAnimal(){
        ArrayList<String>animalList=new ArrayList<>(Arrays.asList("Domestic", "Exotic", "Fish"));
    }
}
class DomesticAnimals extends Animals{
    String item = "Dog";

    DomesticAnimals( String str){
        super(str="CAT");
        System.out.println("Hello from Domestic Animals");


    }

}
class ExoticAnimals extends Animals{
    String item = "Snake";


    ExoticAnimals(String str){
        super("SNAKE");
        String item = "Turtle";
        System.out.println("Hello from Exotic animals");
        System.out.println(item);
        System.out.println(this.item);
        System.out.println(super.item);

    }
}







public class HomeWork {
    public static void main(String[] args) {

        Animals item = new Animals("FISH");
        item.ChooseYourAnimal();
        DomesticAnimals item1 = new DomesticAnimals("AA");
        ExoticAnimals item2 = new ExoticAnimals("a");






    }
}


//Create three classes of your choice and have a parent-child relationship with them
//Create three types of Constructor in Parent class and child class both (Total six Constructor)
//Create a MainClass and create six different object using each Constructor, check the output
//Call Constructor  internally using this and super keyword, and check the output, do more brainstorming by changing different statement