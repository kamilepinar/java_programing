package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {


        char[] ascending = new char[26]; // index: 0~25
        char[] descending = new char[26]; // index: 0~25

        for (int i = 0, j = 'A', k ='Z' ; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j; // A ~ Z//ascendng int oldugu icin explicit casting char yapti
            descending[i] = (char) k; // Z ~ A
        }


        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("------------------------------------------------------");


        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        // bu array karakterlerini cikariyor 65535 karakter cikariyor

        System.out.println(Arrays.toString(characters));







    }
}
