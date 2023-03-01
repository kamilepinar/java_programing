package day42_MAPS;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {
    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        System.out.println("------------------------------------------------");
      //set doesnt accept dublicate thats why we use that keyset method
        //if i need to get every single keys we need to iterate by the keys


        // Iterating the map by the keys
        for (String eachKey : map.keySet()) {
            //map.replace(eachKey,  map.get(eachKey) * 2 );
            System.out.println(eachKey);// bu tum isimleri cikarir
        }


        System.out.println("------------------------------------------------");

        // Iterating the map by values
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("------------------------------------------------");
        // Iterating the map by entries/pairs  key and values
        //in order to iterater the map, use entery seet, the entery set return type is entery interface,it sub interface of map interface
        // soo
        //in order to call t you need to call it from map interface

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

        System.out.println("------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);
            //  System.out.println(eachKey +" : "+eachValue);
        }


        System.out.println(map);






    }
}
