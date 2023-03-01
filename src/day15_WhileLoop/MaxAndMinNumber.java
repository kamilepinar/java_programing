package day15_WhileLoop;

import java.util.Scanner;

public class MaxAndMinNumber {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int max = -2147483648;//any int num that user enter will AlWAYS be greater than this num// googlda aratip baktik
        int min = 2147483647;// any int number given will be always less than this number o yuzden ilk assign numarasi bu oldu

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

}







