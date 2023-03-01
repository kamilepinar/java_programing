package day20_ArrayContinue;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {




        int[] score = { 70,100,80,90,65};
        System.out.println(Arrays.toString(score));//score direk score yazarsan hascode verir
        String result =Arrays.toString(score);//to string  array. you can assigned to string when you give the display result for array

        System.out.println(result);






        //equals method

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);// true result if they are equal , order or element are not the same it would be false

        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2);// this time false

        System.out.println(r2);



        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2));//false order farkli



        System.out.println("---------------------------------------");


        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);//gives the index number after sort it will give ascending order index zero min
        System.out.println("Maximum number: " + nums[nums.length-1] );//last string index is max number


        System.out.println("---------------------------------------");


        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C", "A"};

        Arrays.sort(b1); //b1 = {A, B, C}
        Arrays.sort(b2); //b2 = {A, B, C}
           // this wll give true result
        System.out.println( Arrays.equals(b1, b2) );//after you sort them it will be the same order so they will be equal

        System.out.println("---------------------------------------");



        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));// bu ayni verir


        Arrays.sort(students);

        System.out.println(Arrays.toString(students));// bur sort methoddan sonra olduugu icin sirayla verir





        System.out.println("---------------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};
          //two argument you need to provide
        int[] array2 = Arrays.copyOf(array, 10);// ikincisine  4 koysaydin baslangictan sonra 4 taneyi yazardi

        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------------");



        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length );//ilk first array, ikinci yeni uzunluk iki sinin toplamini veriyosun


        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j]= n2[i];
        }

        System.out.println(Arrays.toString(n3));




        System.out.println("----------------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch, 20 );

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5); // excludes ending index yani 4 e kadar verir CDE verir

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);//son index almak istiyorsan length vermek zorundasin

        System.out.println(Arrays.toString(result3));






    }
}
