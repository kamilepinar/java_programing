package day21_MultiDimensinalArray;

import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "    Hello wordld    I Love      Java          "  ;

       // str =str.trim(); //when you trim method its will remove all the space, we need to assign it back because string is immutable
          // this trim method only remove outer spaces
        // bu trim methodu assigidaki is not empty methodunu koyunca alinda ise yaramaz oldu



        String[] words = str.split(" ");//this wil contain each word and you can split it by space
       // System.out.println(Arrays.toString(words));// dont forget to call it as to string method

        // if you no longer keep the this string object assign to emty string and iterate each of the word and concate to string

        str = "";
         //variable each//data structure, we need to calculate each word
        for ( String each: words){ // which element is not empty string we need to check

            if(!each.isEmpty()){
                str+=each+"";//we are addung this element to the string and ofcourse you need to give space with ""
            }
        }

        str=str.trim();// bunu koydu cunku consolda, cumle sonunda bosluk cikti onu trim yapti//to remove the last space
        System.out.println(str);


    }


}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "
        	Output:
        		Hello world I love Java
 */