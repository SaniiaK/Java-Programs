package com.java.class42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExampel {
    public static <Interator> void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();
        listOfData.add(46);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);

        // Using Index based for loop
        for (int i=0; i <listOfData.size(); i ++){
            System.out.println(listOfData.get(i));
        }



        // using for each loop
        for (int item : listOfData ){
            System.out.println(item);
        }


        // Using Iterator, if we want to visit each index of element we can use iterator
        Iterator<Integer> itr = listOfData.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
