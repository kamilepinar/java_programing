package day20_ArrayContinue;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4,};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length];
        // because we need to make sure 3 array has enough capacity to contain both array

        // you need to assign first arrays index numbers
        int k = 0; // before loop we can declare variable for index number of 3rd array
        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

        int[] a3 = ArraysUtilities.merge(a1,a2);

        System.out.println( Arrays.toString(a3));

        System.out.println("--------------------------------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtilities.merge(b1,b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtilities.merge (ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------------------");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtilities.merge(c1, c2);

        System.out.println(Arrays.toString(c3));








    }


}


