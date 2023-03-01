package day19_array;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int [] arr1 = {10,20,30,40,50}; // this opbject are in the heap memory// this object like a room but 3 rooms
        int [] arr2 = arr1;//this is indipendent arrey it eaithe with new keyword or array literal
        int [] arr3 = arr2;
  // this is only 1 object but  3 variable referenceing array object


        arr1[0] = 1000;
        arr2[2] =3000;
        // bunlar hepsi ayni sonucu verir cunku hepsi ayni object ama diger variable lar in the stack sadece bir heap memoryde
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------------------------------------------");

        String[] a1= {"umran","mehmet"};// after we assign this will be unreacble
        a1 =new String[]{"james","Daniel"};
        System.out.println(Arrays.toString(a1));



    }
}
