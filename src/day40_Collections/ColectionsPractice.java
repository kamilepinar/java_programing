package day40_Collections;

import java.util.*;
import java.util.concurrent.Callable;

public class ColectionsPractice {
    public static void main(String[] args) {


        //List<Integer> list = new ArrayList<>();
        //List referense parent  Array list part could be =linkedlist,stack or vector they are all child class
        // if you use collections u can use



        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);
        System.out.println(  (  (ArrayList) collection).get(2)  ); //upcasting because collection does not have get method
        // so to acces to get method we have to cast it to arraylist

// System.out.println( ( (Stack)collection).pop() );//give last inserted element here you will get class cast exception
        //because this reference type casting is supose to be arraylist you create new object with arraylist


        System.out.println("-------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();//they have is a relasation so you can do polymorhism
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);//hasset does except dublicate we will have only  one 100 and gives random

        //   System.out.println(  ( (ArrayList)collection2 ).get(4)  );/you can not cast to arraylist to hasset

        System.out.println(  new ArrayList<>(collection2).get(4)  );//you have to call the arraylist constructer/this one time use

        List<Integer> l = new ArrayList<>(collection2);//you should assign to new reference variable, now this arraylist has all the element of collections type







    }
}
