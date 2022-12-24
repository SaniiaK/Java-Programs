package com.java.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> listOfItems = new LinkedList<>();

        listOfItems.add("Tomato");
        listOfItems.add("Apple");
        listOfItems.add("Orange");
        listOfItems.add("Mango");
        listOfItems.add("Pineapple");



        //Finding the size of the List
        System.out.println(listOfItems.size());

        // Get element from list using index

        System.out.println(listOfItems.get(2));

        // Print  all the data from list using enhanced for loop

        for (String names : listOfItems){
            System.out.print(names + ", ");
        }

        //Print the data using the iterator

        Iterator<String> itr = listOfItems.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // Finding the greatest number from the list


        // first we need to create an object of the list
        List<Integer> numbers = new ArrayList<>();
        // we need to add numbers
        numbers.add(10);
        numbers.add(43);
        numbers.add(65);
        numbers.add(26);
        numbers.add(77);

        // Assume first number is max number

        int max = numbers.get(0);

        // comparing each number with our max number
        for (int num : numbers){
            if (num > max){
                max=num;
            }
        }
        System.out.println(max);


    }
}
