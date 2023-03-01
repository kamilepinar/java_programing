package day21_MultiDimensinalArray;

import utilities.ArraysUtilities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        // bunlarin ayni harflerle olan kelimeler, buynlari once sort yapicaz her harf ve sayisi ayni ise anagram
// to char at method ile  yada split method ile yapabilirsin,char at  methodu ile yapardsn each karakteri verir
        // sort method is not from java it from Arrayutility class, after split or char at sonra sort

        //we can split  method and spit by emty string it will give each carakter also

         char[] a1 = str1.toCharArray();
       // String[] a1 =str1.split(""); bu da split methodu ile bulma ikisinde de ayni sekilde cikiyor
        System.out.println(Arrays.toString(a1));// burda h,e,a,r,t diye cikti


        char[] a2 = str2.toCharArray();
        System.out.println(Arrays.toString(a2));


        // we already split it now we need to sort it

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1)); //we are printing now they are same element same order
        System.out.println(Arrays.toString(a2));
 // so if they are equal than they are anagram. and for thisae boolean

        boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println("isAnagram: " +isAnagram);


 // this are single demensinal array and it  only have one []

        // int[] score ={10,20,30,40,59};

    }





}
