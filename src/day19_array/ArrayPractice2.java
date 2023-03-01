package day19_array;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int [] arr1 = new int[100];
          // i = index number and j = element that we wanted to assigned starting from 1 to 100 yazmasi icin her index numbera assign yapmis oluyor
      /* for (int i = 0, j =1; i < arr1.length; i++, j++) {
             arr1[i]=j;
        } // bu burda olsa bile assagiya yenisini assign yaptigin icin consolda cikmadi/gabage collector aldi

        System.out.println("-------------------------------------------------");
        //10 dan 100 e kara 10ar 10 ar istersen
        for (int i = 0, j =10; i < arr1.length; i++ , j+=10) {
            arr1[i] = j;
        }*/

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1; // this is another way to increase the value its shows.
        }


        //soutv assagidakini otomatik yaziyo
        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("----------------------------------------");
        
        
        
        int []arr2 =new int [100];// index : 0~ 99
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("----------------------------------");
        for (int i = 0 , j = 100; i < arr2.length; i++, j --) {

            arr2[i] = j;
        }
        // yada for( int i == arr2.length -1 , j =100; i >=0; i-- , j--){
 // without the j,
        for(int i = 0 ; i < arr2.length; i ++){
            arr2[i]= 100 - i ;
        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));





    }
}
