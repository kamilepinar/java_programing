package day11_StringContinue;

import java.sql.SQLOutput;
import java.util.Locale;

public class Stringmethods1 {
    public static void main(String[] args) {


        String str1 = "Cydeo SCHOOL";

       // str1.toLowerCase();// it convers all the letter to lover case
        // they always creat new string it can not change the first one o yuzden  assign yaoiyosun boyle
        str1 = str1.toLowerCase();  // assign yaptiktan sonra artik bu lover case verir.

        System.out.println(str1);// bunu da versen kucuk harfe donmuyor cunku string inmutable and you can not modify


        System.out.println("---------------------------------------");


        // non of the method will change the string, they just create a new string with asiignment
        String str2 = "java programing";
        str2 = str2.toUpperCase();//JAVA PROGRAMIN YAPMASI  ICIN ASSIGN YAPTIK\
        System.out.println(str2);



        System.out.println("---------------------------");


        String word ="wooden Spoon";
        word = word.toUpperCase();
        word =word.toLowerCase();//enson neye cevirdiyse o cikiyor sonucta, original hic degismiyor
        System.out.println(word);


        System.out.println("===================================================");

        String str4 = "          Cydeo School";

        str4 =  str4.trim(); //"Cydeo SchooL"

        System.out.println(str4);

        System.out.println("---------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";
        // burda mesela we deki w nun index numberini bulmak istersen bunu kullanicaksin

        int index1 = sentence1.indexOf('w');//sonuc 21 cikiyor index oldugu icin yani 22inci karakter w

        System.out.println(index1);

        String s1 ="I Love Java Programing";

        int firstA = s1.indexOf('a');
        System.out.println(firstA);
        //what if you want to find the second a- you need to use double quote

        int secondA = s1.indexOf("a ");//it will return the first squence yani a in sirasi index num vericek

        System.out.println(secondA);

        //------------------------------------------------

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');//bu index 1 olur j o cunku

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);


        //-----------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a')); //3

        String w2 = "Java Python JavaScript Cydeo Python";


        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));








    }
}
