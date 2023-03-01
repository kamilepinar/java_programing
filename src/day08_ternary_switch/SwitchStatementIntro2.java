package day08_ternary_switch;

public class SwitchStatementIntro2 {

    public static void main(String[] args) {

        int n =9; //it  faster to you switch statement
     // asending order yaparsan anlasilmasi daha kolay olur
        //bundan her birini tek tek yazman lazim eger grade 100 verirsen 100 tane yazman gerek
        // daha hizli ama daha uzun yazmasi
        String day="";

        switch (n){
            case 1: // if you dont put break it will contiunie to print rest of them
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");//on last one you have curtly brace its optional to put break. it doesnot matter
        }










    }
}
