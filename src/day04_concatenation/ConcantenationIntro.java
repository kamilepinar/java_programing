package day04_concatenation;

import java.sql.SQLOutput;

public class ConcantenationIntro {

    public static void main(String[] args) {

        String name =  "Alex" ;

        byte age = 55;
        int salary = 85_000;

        System.out.println("Hello " + name + "." );
        System.out.println("You are " + age + " years old " + ".");
        System.out.println("Your Salary is " + salary + " USD");


        int number = 100_000_000;

        System.out.println( " Number = " + number);



    }
}
