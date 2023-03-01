package day06IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

//we have 3 possible output, months 31.30,28 ceker

        int number =10;

        boolean has28Days = number ==2;//if the months number is 2 its february
        boolean has30Days = number == 4 || number == 6 || number ==9 || number ==11 ;//geri kalanini boylede yazabilirsin
        boolean has31Days = !has28Days && !has30Days; // boylede yazabilinir daha kolay does not statement ile !
        //string value result kullanirsan  we can just assign the value to variable

        String result ="";

        if(has31Days){
            result = "31 days";
        }

        if(has30Days){
            result = "30 days";
        }
        if (has28Days){
            result = "28 days";

        }
       /* if(has28Days){
            System.out.println("28 days");
        }
        if (has30Days){
            System.out.println("30 days");
        }
        if (has31Days){  */




/* 1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month

Ex:
Given:
number = 1

output:
31 days

Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2 */




    }
}
