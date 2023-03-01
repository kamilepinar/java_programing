package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        String result = "";    //a3b4c5

        for (String each : str.split("")) {

            int frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );
             //you need to create array  so you can use collection method, array aslist method,array to arraylist
            if(!result.contains(each)) {//a3a3a3b4b4b4b4c5c5c5c5c5cv cikmasin diye
                result += each + frequency;
            }

        }
        System.out.println(result);





    }
}
