package com.java.Practice;

import java.util.Scanner;

public class AnimalBaseConstructor {
   String animalName;
   String breed;
   int size;
   int weight;
   int age;
   String color;
   String animalType;



   public AnimalBaseConstructor(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please choose your animal type?");
      animalType = sc.nextLine();

      System.out.println("Please choose the breed?");
      breed= sc.nextLine();


      System.out.println("Please choose the age?");
      age = sc.nextInt();

      System.out.println("Please choose animal name?");
      animalName = sc.nextLine();

      System.out.println("Please choose the color?");
      color = sc.nextLine();

   }

   public AnimalBaseConstructor (String animalType, String animalName, String breed, int size, int weight, int age, String color){
      this.animalType=animalType;
      this.animalName =animalName;
      this.age = age;
      this.breed = breed;
      this.color =color;

   }






}
