package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {


    public static void main(String[] args) {



        String[] myGroup = new String[5];
        myGroup [0] = "Gulcin";
        myGroup [myGroup.length-1] = "Aseel";
        myGroup [2] = "Sumeyye";
        myGroup [1] = "Abdullah";
        myGroup [3] = "Asli";

        System.out.println(Arrays.toString(myGroup));

        //how should i update the element
        myGroup [1] = "Kuzzat"; // we can change the ellement, its mutable but size is fixed!!

        System.out.println("-----------------------------------");
        for (int i = myGroup.length-1 ; i >= 0; i--) { // this is the loop to iteration the reverse order
            System.out.println(myGroup[i]);
        }
        System.out.println("------------------------------------------");
       // myGroup.fori // this can crreate the iterate the array auto
        for (int i = 0; i < myGroup.length; i++) {

        }
        System.out.println("-----------------------------");

        //myGroup/forr  it give the for loop for reverse array

        for (int i = myGroup.length - 1; i >= 0; i--) {

        }






    }
}
