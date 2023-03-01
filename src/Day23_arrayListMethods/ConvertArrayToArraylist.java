package Day23_arrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArraylist {

    public static void main(String[] args) {


        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println(list);


        System.out.println("------------------------------------------------------");



        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray(new String[0]);//toArray method to convert it.
        //new string means the new size, instation the new size and the number we give is the minumum size so we need to use 0
         //if the size like 10 burda 3 tane element oldugu icin geri kalan 7 null olurdu
        //you can do also new String[list2.size()]
        System.out.println(Arrays.toString(languages));

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        //when ever you convert data type has to be same.Integer toInteger
        // AS LIST METHOD COVERT INT ARRAY TO THE LIST
        Integer[] n = nums.toArray(new Integer[0]);
        //   int[] n = nums.toArray(new Integer[0]); // you will get complie error. primitive out of question because its collection

        System.out.println(Arrays.toString(n));




    }
}
