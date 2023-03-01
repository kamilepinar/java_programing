package day42_MAPS;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");


        Map<String, String> employees = new TreeMap<>();//we want to use sorted order thats why we use treemap
        employees.putAll(map);//put all method has to be map as argument
        //if this would be linked hasmap key and values wll be added not the objects

        System.out.println(employees); //map in icindekileri employeesa aldi

        System.out.println(map == employees); // false // bunlar farkli memory oldugu icin sadece equals method ile dogru cikabilir

        System.out.println(map.equals(employees)); // true//order matter in equals method
        // tree maps ikisi de sorted order ywe can compare them
        // new key word open new memory allocation in heap. only equals can check two different but order has to be same




    }
}
