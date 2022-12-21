package com.java.class42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();
        personAge.put("Chirag", 29);
        personAge.put("Sania", 33);
        personAge.put("Maria", 18);
        personAge.put("Gulnur", 40);
        personAge.put("Sania", 5);
        personAge.put(null, 30);
        personAge.put(null,35);

//              List of keys
        Set<String> setOfKeys = personAge.keySet();

        for (String key : setOfKeys){
            System.out.println(key + " = "+ personAge.get(key));
        }

        // Retrieving collections of pair
        System.out.println();

        Set<Map.Entry<String, Integer>> pairs = personAge.entrySet();

        for (Map.Entry<String,Integer> pair   : pairs ){
            System.out.println(pair.getKey()+ "=" + pair.getValue());
        }

//        System.out.println(personAge);
//        System.out.println(personAge.get("Chirag"));
//        System.out.println(personAge.values());


    }
}
