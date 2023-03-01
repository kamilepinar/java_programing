package day21_MultiDimensinalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {


        //index of elements 0 1  2  3      0  1  2  3  4    5   6
        int [][] arr2D = {{10,20,30,40}, {40,50,60,70,80}, {90,100} };
        //    index :         0               1               2

                           //       3  baskada olabilir o yuzden length
        for (int i = 0; i < arr2D.length; i++){ // i: index number of 1D arrays in arr2D

            int[] each1D = arr2D[i];// this is going to return you first element of 2d array
            System.out.println( Arrays.toString( each1D ) );
                                       //        arr2d [i] aslinda bu ama daha anlasilir olsun diye each1d assign yapti
            //bu 2 d nin icindeki 3 tanesini ayirmak icin


            // buda her index icindeki arraylari ayirmak icin tek tek bi alt indexleri buluyor
            for (int j = 0; j < each1D.length; j++){ // j: index number of elements in each 1D array of arr2D

                int eachElement = each1D[j];

                System.out.println(eachElement +",");

            }

        }
  // for each loop is easier but for loop ustteki more powerfull because you can update the values but in for each you can not update value
   // and for loop you can reverse the order but in each you can not reverse

        System.out.println("----------------------------------------------------------");


        //iterating multi array
        for(int[]  each1DArray : arr2D ){
            System.out.println(Arrays.toString(each1DArray));

            for(int eachElement  : each1DArray ){
                System.out.println(eachElement);
            }

        }


        System.out.println("----------------------------------------------------------");

        // this is reverse order
       //arr2d forr+enter  iteration yaparak veriyor 100-90-80-70 diye geri gidiyor sirayla
        for (int i = arr2D.length - 1; i >= 0; i--) {//once 2d reverse
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//1d reverse
                System.out.println(arr2D[i][j]);//once 2d elemeti sonra her elementin icindekileri gosteriyor
            }
        }


        System.out.println("----------------------------------------------------------");

        // bude iterate yapiyo ama for each oldugu icin reverse yapamiyor

        for (int[] each1DArray : arr2D) {//each1d array of 2demesional array
            for (int eachElement : each1DArray) { // buda her 1d arrayin icindeki elementler
                System.out.println(eachElement);
            }
        }










    }
}
