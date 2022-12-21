package com.java.class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPracticeExample {
    public static void main(String[] args) {


        List<String> listOfData = new ArrayList<String>();

        listOfData.add ("Banana");
        listOfData.add ("Apple");
        listOfData.add ("Potato");
        listOfData.add ("Tomato");
        listOfData.add ("Banana");
        listOfData.add("Banana");
        listOfData.add ("Apple");
        listOfData.add ("Orange");
        listOfData.add ("Cucumber");
        listOfData.add ("Mango");
        listOfData.add ("Tomato");
        listOfData.add ("Banana");
        listOfData.add ("Apple");


        System.out.println(listOfData);


        Set<String> uniqueItem = new HashSet<>();
        uniqueItem.addAll(listOfData);

        System.out.println(uniqueItem);

         //Find duplicate items in the given list

        // This is the interview question for duplicate value


            Set<String>duplicateItems = new HashSet<>();
            Set<String>uniqueElements = new HashSet<>();
            for (String value: listOfData){
               // System.out.println(value + "=" + uniqueElements.add(value)); //Banana=true Apple=true Potato=true Tomato=true Banana=false Banana=false

                if (uniqueElements.add(value)==false)
                    duplicateItems.add(value);
                }
            System.out.println("Duplicate value:" + duplicateItems);

            }

    }

