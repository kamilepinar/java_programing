package day21_MultiDimensinalArray;

import utilities.ArraysUtilities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,60,70,80};
        int element =90;

        //{1,2,3,4,5,6} bunu yapabilmek icin  you need a new array
        //you need to creat new size with the first array + element yani array +1

        int[] new_array = Arrays.copyOf(array,array.length +1);//[1,2,3,3,4,5, 0] cikti nasil assign yaparsin??assign to new array
        new_array[new_array.length-1]=element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("------------------------------------------");

        int[] numbers = { 100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArraysUtilities.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));


        System.out.println("------------------------------------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtilities.addElement(nums, 5.5);

        nums = ArraysUtilities.addElement(nums, 6.5);

        nums = ArraysUtilities.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArraysUtilities.addElement(students, "Umran");

        students = ArraysUtilities.addElement(students, "Abidullah");

        students =ArraysUtilities.addElement(students, "Muhtar");

        System.out.println(Arrays.toString(students));








    }

}
