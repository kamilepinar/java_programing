package day07_ifStatement;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num =-45;

        String result = "";// these are indipendent if statement and the code has to be more efficient,like this compplier

        // check ever statement thats why we use if else statement.

        if(num > 0){
            result = "Positive";
        }
        if(num < 0){
            result = "negative";
        }
        if(num == 0){
            result = "Zero";
        }
        System.out.println(result);
        System.out.println("----------------------------------------------------------");


        String result2 = "";// if the first true remaining not get check if false it continue  to next.
        if(num > 0){
            result2 ="positive";

        }else if (num < 0){
            result2 = "negative";
        }else{ // else block means othervise if not both of them than else block gets executed
            result2 = "zero";
        }
        System.out.println(result2);







    }



}
