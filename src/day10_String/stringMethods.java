package day10_String;

import java.util.Scanner;

public class stringMethods {

    public static void main(String[] args) {

        String str = "Cydeo"; // it has 5 character but index number is 4 because it start with zero
        // index      01234


        char firstChar = str.charAt(0);//you call char at method and ask for character zero.str is first variable
        char secondChar = str.charAt(1);
        char thirdChar =str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);
      //  char sixth =str.charAt(5);


        System.out.println("firstchar:"+ firstChar);
        System.out.println("second char " + secondChar);
        System.out.println("third char: " + thirdChar);
        System.out.println("fourth char: "+fourthChar);
        System.out.println("fifth character "+ fifthChar);

       // System.out.println("sixth chsrchter"+ sixth);// it will give you error becuase there is no 6th charcter


        // index out of banned erro verir karakter numarasinin disina cikarsan
        System.out.println("-----------------------------------------------");

        //string lenght hesabi

        String sentence = "Java programming language";
        //space count  as one character too

        int lenght = sentence.length();

        System.out.println(lenght);

        int lastIndex =lenght-1;// because its start from zero

        System.out.println("-----------------------------------");

        String s1 ="wooden Spoon";

        char first =s1.charAt(0);
        int lastIndexNum = s1.length() -1;
        char last =s1.charAt(lastIndexNum);


        int lenght2= s1.length();
        System.out.println(lenght2);

        System.out.println("------------------------------------------------");
        //you can not compare string object it will give back false

        String name1 ="umran";
        String name2 = new String("umran");// bu yeni new String cagirdigin icin farkli lar

        System.out.println("name1==name2");// it gives false they are not  equal
        // but there is method name equals method it will give you same true result even tho they are two different object
        // if the have same string litirals. ayni gorunuslu yazi demek

        System.out.println(name1.equals(name2));// bunu da koyarsan this will be true

        System.out.println("------------------------");

        String r1="Java";
        String r2 ="Java";

        String r3 = new String("Java");

        System.out.println(r1==r2);// they are same even tho  they have same litiral. they both in the string pool as onky one.
       // this will give true
        System.out.println(r1==r3);// this is falls because one in string pool but r3 is out of the string pool
        // but its inside the heap memory but in difrent place. semayi hatirla

        System.out.println(r1.equals(r3));// true cunku equal yapiyorsun
        System.out.println(r2.equals(r3));// true verir

        System.out.println("-----------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age >= 21 &&  answer.equals("yes") ){// eger equals koymazsan farkli algilar ve o yuzden yes almaz sonucs not eligible cikar
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }



        input.close();


    }
}
