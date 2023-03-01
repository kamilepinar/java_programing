package day01_introToPrograming;


import java.util.ArrayList;
import java.util.Arrays;

import static utilities.StringUtility.reverse;

public class test {
    public static void main(String[] args) {


        int value = 10;

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                int result = i * j;
                // System.out.print(result);
                System.out.printf("%4d", result); //d--an integer, 4 characters wide, right aligned

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=========================");

        System.out.println();
        System.out.printf("%-4d", 2); // d--an integer, 4 characters wide, - left aligned
        System.out.println();

        double x = 3.1434309384433;
        System.out.printf("%.2f", x);//f-- floating point value, 2 characters wide, right aligned

        System.out.println();
        System.out.println("=========================");



        System.out.println();
        System.out.printf("%.4s", "6000 results displayed"); // to limit the number of
        System.out.println();                                //characters in our output  (to get 4 char)









    }



    }

