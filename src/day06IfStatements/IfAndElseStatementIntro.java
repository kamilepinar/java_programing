package day06IfStatements;

public class IfAndElseStatementIntro {


    public static void main(String[] args) {

        // are you eligible to  buy alchool or not

        int age =28;
        if (age >=21){
            System.out.println("eligible");


            if(age<21){

                System.out.println("not eligible"); // this solution nt the best solution. you need two indipendent if

                //statement and complier has to check both condition but instead chosing two independent if statement
                // we can creat if and else statement

                if (age>=21){
                    System.out.println("eligible");
                } else {
                    System.out.println("Not eligible");
                }

            }



        }





    }
}
