package day07_ifStatement;

public class MonthName {


    public static void main(String[] args) {

        int n =15;

        String month = "";

        if(n>=1 && n<= 12){

            if(n==1) {
                System.out.println("January");
            }else if(n==2){
                System.out.println("february");
            }else if(n==3){
                System.out.println("March");
            }else if(n==4){
                System.out.println("April");
            }else if(n==5){
                System.out.println("May");
            }else if(n==6){
                System.out.println("June");
            }else if(n==7){
                System.out.println("july");
            }else if(n==8){
                System.out.println("August");
            }else if(n==9){
                System.out.println("September");
            }else if(n==10){
                System.out.println("october");
            }else if(n==11){
                System.out.println("November");

            }else System.out.println("December");// en sondaki else oluyor ve boyle yaziliyor

        }else{
            System.out.println("No such a month");
        }


        // this is curly brace kullanmadan yazilan hali ama bunu yapma
        /*  if(n >= 1 && n <= 12){

            if(n==1) month = "January";
            else if(n==2) month = "February";
            else if(n==3) month = "March";
            else if(n==4) month = "April";
            else if(n==5) month = "May";
            else if(n==6) month = "June";
            else if(n==7) month = "July";
            else if(n==8) month = "August";
            else if(n==9) month = "September";
            else if(n==10) month = "October";
            else if(n==11) month = "November";
            else month = "December";

        }else{
            month = "No such a month";
        }

        System.out.println("month = " + month);*/










    }
}
