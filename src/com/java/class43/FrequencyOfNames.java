package com.java.class43;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNames {
    public static void main(String[] args) {


        String names = "chirag maria gulnur ali "+
                "maryna max ali maria max "+
                "ali chirag yana maggie ali "+
                "yana maggie ali maryna max";

        String [] arrayOfNames = names.split(" ");

        Map<String, Integer> frequency = new HashMap<>(); // Amazon interview question
         for (String name : arrayOfNames){
             if (frequency.containsKey(name)) { // First we need to check if name is there and if its we will jump into the if statement
                 int count = frequency.get(name);
                 frequency.put(name, count + 1);
             }else{
                 frequency.put(name, 1); // we go to else part if we don't have name
             }
         }System.out.println(frequency);

         Map <String, Integer> greateastNum = new HashMap<>();

         int max = frequency.get(0);

//         for (int num : greateastNum.values()){
//             if (greateastNum.values(num)>max){
//                 max = frequency.values();
//             }

        // }
    }
}
