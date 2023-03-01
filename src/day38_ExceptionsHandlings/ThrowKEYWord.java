package day38_ExceptionsHandlings;

import java.io.FileNotFoundException;
import java.rmi.ServerError;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKEYWord {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age>150){
            if(age<0){
                throw new InputMismatchException("Age of the person can not be negative"); //exceptin olan line inida verir it will still exit the program
            }else{
                throw new InputMismatchException("Age can not be greater than 150: " + age);//user will now what went wrong
            }

            //System.err.println("Invalid age");
            //System.exit(1);
        }
        if(age >=21){
            System.out.println("Eligible");
            }else{
            System.out.println("Not Eligible");
        }

        System.out.println("----------------------------------------------");

       // throw new RuntimeException("Runtime exception");
     //   System.out.println();//if program has exception on line31   it can not continue


       // throw new FileNotFoundException("");//check exp. this line give compile error becauce its check exception


        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------------");

        RuntimeException exception = new RuntimeException();

        // throw exception;bu esittir more than one kullanicaksan bunu yapabilirsin exception object create yapiyosun
        // throw new RuntimeException();

        // throw new Person("Jimmy", 45, 'M'); you can not use trow with anoy other object only for exception and (with is a relationship)





    }
}
