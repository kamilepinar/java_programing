package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];// this array to contain all the number that user going to enter, and if the first input ten it contain 10
        int sum = 0;

        for (int i = 0; i < total; i++) {// total will be the length
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double average = sum / (double)total;// when you divede int /int java ggive int result. if you want to get exact resulkt you do casting

        DecimalFormat df = new DecimalFormat("0.00");



        System.out.println("Numbers: "+ Arrays.toString(numbers));
        System.out.println("sum: " + sum);
        System.out.println("average: "+df.format(average) );









    }

}



/*
 AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number
 */