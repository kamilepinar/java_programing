package day39_Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        System.out.println("----------------------------------------");

        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null key
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set1);


        System.out.println("----------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();  // keeps insertion order, accepts null key
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);


        System.out.println("----------------------------------------");

        String str = null;
        // System.out.println(str.toLowerCase());


        Set<Integer> set3 = new TreeSet<>(); // Keeps sorted order, does not accept duplicate
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));//10,40,90,200,300 keeps sorted boyle cikar
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //  set3.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set3);


        System.out.println("----------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>();
        result.addAll( Arrays.asList(words) );//if you want to same order but remove duplicate
        // you can not pass array to collection direc so you need to use aslist method
        System.out.println(result);

        /*
        // System.out.println(result.get(1));//set does not have index number
        for (String each : result) {//we can iterate the set with for each loop but converting other type is easier
            System.out.println(each);
        }
        */

        System.out.println( new ArrayList<>(result).get(1) );

        words = result.toArray(new String[0]);  // converting Set to Array back


        System.out.println("Words Array : " + Arrays.toString(words));


        System.out.println("----------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50,5, 5, 5, 1, 1, 1, 2, 2,2));

        Set<Integer> n = new TreeSet<>(numbers); // List to Set// tree set has sorted order and removes dublicates

        System.out.println(n);

        System.out.println("--------------------------------------");
        numbers = new ArrayList<>(n);



    }
}

