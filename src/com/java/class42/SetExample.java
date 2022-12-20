package com.java.class42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> setOfData = new HashSet<>();

       setOfData.add(45);
       setOfData.add(50);
       setOfData.add(20);
       setOfData.add(10);
       setOfData.add(435);
       setOfData.add(30);

        System.out.println(setOfData);

        //you can retrieve data from set by using for loop only
        // index and index based loop are not available for the set methods
        for (int num : setOfData){
            System.out.println(num);
        }

    }
}
