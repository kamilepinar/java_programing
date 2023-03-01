package day20_ArrayContinue;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String str = "Cydeo School";

        str.toCharArray(); // it will give you char array, will give you every single character of the string
     //to char array argument vermene gerek yok sadece cvumlenin her harfini cikarmana yardim eder

        char [] ch = str.replace(" ", "").toCharArray();// replace yapti aradaki bosluk cikmasin diye
        System.out.println(Arrays.toString(ch));

        System.out.println("----------------------------------");

        String str2 = "Today is a great day to learn java";
        //str2.split(" "); // its a string array, bosluk is the spliting point and it will not printout
      // you need to asiggned it to String

        String [] words = str2.split(" ");// this split first creating array so we can do other stuff on it

        System.out.println(Arrays.toString(words));// to string method da argument yazman gerek

        System.out.println("-----------------------------------------------------");


        //reverser sentece

        String sentence = " I Love Java";
       String [] arr =  ArraysUtilities.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr));

        String reversedSentence = ""; // Java love I

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + ""; // ters cevirdigin her kelimeyi reverse methoduna ekliyor ki ortadaki virgul kalkip cumle olsun
        }


        System.out.println(reversedSentence);






    }

}
// toCharArray()  string method
// split (charSquence)