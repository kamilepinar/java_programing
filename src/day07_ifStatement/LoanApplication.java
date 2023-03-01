package day07_ifStatement;

public class LoanApplication {

    public static void main(String[] args) {


/*
1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given,
write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */



        int salary = 55000,
                creditScore = 680;

        String result = "";

        if( salary >= 45000 && creditScore >= 700 ){
            result = "You are eligible for the loan";
        }else{ result = "you are not eligible for the loan";
        }
        System.out.println(result);





        // this is kind of local variable, if you don set they dont have value, like '' empty string or zero gibi

        //if(salary >= 45000 && creditScore >=700) {
           // System.out.println("you are eligible for the loan");
       // }else{
          //      System.out.println("You are not eligible");


        // instead of using sout, result verip altina
        //result = "you are eligiable yazabilirsin





        }







    }



