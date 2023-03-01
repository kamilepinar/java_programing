package day07_ifStatement;

public class NestedIfIntro {

    public static void main(String[] args) {


        /*nested if pre condition scorun valid olmasi icin 0 dan buyuk yuzden kucuk olmasi gerek
        //            //pre condition curly bracinin icine if statement koyuyorsun. if { yeni if} eger pre condition false ise
        //            //en altta curly brace kapanan yerde else block koyuyorsun ve invalid yazisini print statement yapiyosun*/


        int score = -399;


        if (score >= 0 && score <= 100) {

            if (score >= 60) { // if the score is greater or equal to 10
                System.out.println("Passed");
            } else {
                System.out.println("failed");
            }

        } else {
            System.out.println("Invalid Score");
        }//if the score is valid

        System.out.println("---------------------------------");

        //ikinci soru, check if the person eligible to buy alkol


        int age = -200;

        if (age >= 1 && age <= 150) {

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }

        } else {
            System.out.println("Invalid age");

        }


        System.out.println("--------------------------------------------------");

        int day= 8;

        if( day >= 1 && day<= 7){

            if(day==1){
                System.out.println("Monday");
            }else if (day == 2 ){
                System.out.println("tuesday");
            }else if (day == 3 ){
                System.out.println("Wednesday");
            }else if (day == 4 ){
                System.out.println("Thursday");
            }else if (day == 5){
                System.out.println("Friday");
            }else if (day == 6 ){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }





        }else{ // if the precondition is fail then this else bloack it use, before running all the code its make sure first if its valid
            System.out.println("Invalid day");}





















    }
}