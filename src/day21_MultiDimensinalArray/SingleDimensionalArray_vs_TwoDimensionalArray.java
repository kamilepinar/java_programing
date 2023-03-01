package day21_MultiDimensinalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {


    public static void main(String[] args) {


        int[] arr1d = new int[10];//uzunlugu on tane element alan single dimension array yaptik
        arr1d [0] =100;
        arr1d [1] =90;//bunlari ben koydum sonuna kadar assign yapabilirsin ben sadece 4 tanesini yaptim
        arr1d [2] =80;
        arr1d [3] =70;
      // [100, 90, 80, 70, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr1d)); //[0,0,0,0,0,0,0,0,0,0] cikar




        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 19, 20, 21};

        int[] arr6 = {30, 40, 50, 60, 70, 80, 90};


        int[][] arr2D = new int[5][]; // index: 0 ~ 4

        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        // arr2D[5] = arr6;

        System.out.println(Arrays.deepToString(arr2D));//two dimensional icin deeptostring kullanmak gerek


    }
}
