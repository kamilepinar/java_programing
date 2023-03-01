package day15_WhileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int min = 2147483647; //Any integer number that user enters will ALWAYS be less than 2147483647

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();   // 20, 30, -5, 100, 200

            if (num < min) { // if the user entered entry is less than the current minimum number that we have
                min = num; // then user entered number should be the minimum number

                // ilk once 20 yi gecti mesela simdi 20 en kucuk oldu
                // sonra 30 cek yapiyo hangisi kucuk yine 20 o zaman 30 geciyor hala 20 en kucuk
                // simdi -5 yaziyo user , simdi en kucuk number -5 oluyor
                // sonra 100 yaziyor ama hala -5 kucuk rakam
                //sonra 200 giriyor ama yine -5 en kucuk rakam
                //loop will contiunue to execute the code but if new enteries is not small as in the iff statement.
                // loop will skip and check the next entry

            }

        }


        System.out.println("Minimum number is: " + min);


        input.close();




    }
}

     /*   2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number
        */