package Day22_arrayList;

import utilities.ArraysUtilities;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,90};

       boolean has25 = ArraysUtilities.contains(numbers,25);
        System.out.println("has 25 : " +has25);

        System.out.println("-----------------------");

        String[] students= {"Sumeye","Hamza", "Marika"};
        System.out.println(ArraysUtilities.contains(students,"Khashayar"));


    }
}
