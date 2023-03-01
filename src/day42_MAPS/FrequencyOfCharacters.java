package day42_MAPS;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            map. put(each, frequency);
        }

        System.out.println(map);


        /*  String str = "aaabccdeeef"  gibi bi string olsaydi sadece unique char bulmak icin
        Map<Character, Integer> map = new LinkedHasMap<>{
        int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
        if(frequncy == 1)
        map.put(each.CharAt(0),frequency); // methodu ile b=1 d=1 f=1 sadece uniq olanlari alabilirdik
        *



        */


        //bu char ile yazildiginda daha uzun olan yol o yuzden key bolumune string yazdik ki conver kolay olsun

        /*   String str ="bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();
        //we have frequency method on collection, we need to each element of this map as collection
        //if you create String array we can convert it to collection

        for (String each : str.split("")){//split is an array yapti
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
           // System.out.println(each); b b c c c a a a a  sekldinde cikariyor simdi



            map.put(each.charAt(0),frequency);  bi burasi farkli oldu

        }
        System.out.println(map);//{b=2, c=3, a=5} boyle cikar
*/



    }
}
