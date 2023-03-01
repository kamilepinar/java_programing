package day32_finalKeyWord;

import java.time.LocalDate;

class Student{// final class an not be inherit, like java lang pkg are final so you can not extend those, or any other class you create final you can not inherit

    public final void language(){ // you can not override method so it can not change
        System.out.println("Java Programming");
    }

}

public class FinalKeyWord extends Student {

       /*
    public void language(){ // final methods can never be overridden
        System.out.println("Python Programming");
    }
*/
    public  FinalKeyWord(){ //
    }


    public static void main(String[] args) { // you can add final to static method but its static so its pointless

        final char gender = 'M';

        System.out.println(gender);
       // gender = 'F';//you can reassign final yaparsan assign yapamazsin


       // System.out.println(gender);

        System.out.println("------------------------------------------------------");
       final LocalDate dateofBirth = LocalDate.now();

        System.out.println(dateofBirth);
        //dateofBirth =dateofBirth.plusYears(1);

        System.out.println("-----------------------------------");

        new Student().language();
        new FinalKeyWord().language();

        System.out.println("-----------------------------------");

        final String name = "James";
        // name = null;
        // name = "Daniel";

        System.out.println(name);




    }
}
