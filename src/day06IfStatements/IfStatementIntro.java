package day06IfStatements;

public class IfStatementIntro {


    public static void main(String[] args) {


        int number = 200;

        boolean isPositive = number >0;
        boolean isNegative = number<0;
        boolean isZero =  number == 0;


        // if statement da you need to put curly braces hit enter it will also give closing one


        if ( isPositive)
        {
            System.out.println(number + " is positive");// it wil not print on the console because its not postive
        }



        if(isNegative){ System.out.println(number + " is negative");
        }

        // cury braces den sonra hangisi dogru ise o sonucu cikariyor


           // if(isZero){ System.out.println(number + " is zero");


        System.out.println("----------------------------------------");

        // if statement yazmak icin once variation veriyorsun sonra if boylemidir diye soruyorsun sonra curly brace acip
        // print statement yaziyosun

        int num = 25;

        if ( num > 0){

            System.out.println(num + "is positive number");
        }// 25 positive oldugu icin sadece bu statement cikiyor 25 is postive diye

        if (num < 0){
            System.out.println(num + " is negative number");
        }


        if(num == 0){
            System.out.println(num + " is zero");
        }








            }



        }








