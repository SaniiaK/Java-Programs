package com.java.class41;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> listOfData = new ArrayList<Integer>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);
        listOfData.add(2,43);
        listOfData.add(5,7);
        listOfData.add(33);
        System.out.println(listOfData);


//        for (int data : listOfData){
//            System.out.println(listOfData);
//        }
        int min = 0;
        int minIndex = 0;
        for (int i =0; i<listOfData.size(); i++){
            //min =listOfData.get(i);
            for (int j=i; j<listOfData.size();j++){
                 min =listOfData.get(j);
                if (listOfData.get(j)<min){
                    min = listOfData.get(j);
                    minIndex = j;

                }
            }
            int temp = listOfData.get(i);
            listOfData.set(i,min);
            listOfData.set(minIndex,temp);
        }
        System.out.println(listOfData);




    }
}
