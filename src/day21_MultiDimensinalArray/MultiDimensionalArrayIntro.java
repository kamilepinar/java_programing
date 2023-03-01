package day21_MultiDimensinalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int [] arr1 = {10,20,30,40};
        int [] arr2 = {40,50,60,70,80};
        int [] arr3 = {90,100};

        //in order to container for this data we need multidemensianal array
       // /bunlar single yani one dimentional oldugu icin multi dementioanal 2 olmasi gerek. 2 demensional array
       // the n dimensional array is container for n-1 dementional array


        int [][] arr2D = {{10,20,30,40}, {40,50,60,70,80}, {90,100} };
         //    index :         0               1               2
        System.out.println(arr2D.length);


        System.out.println( Arrays.toString( arr2D[1] ) ); // [40, 50, 60, 70, 80]//elemeti veriyor yani single dimentional array cikiyor sonucta
        System.out.println( Arrays.toString( arr2D[2] ) ); // [90, 100]
        System.out.println( Arrays.toString( arr2D[0] ) ); // [10, 20, 30]

        System.out.println( arr2D[2][0] ); // 90- ilk [] element index ikincisi o elementin yani o arrayin icindeki index number

        System.out.println( arr2D[1][2]  ); // 60



    }
}
