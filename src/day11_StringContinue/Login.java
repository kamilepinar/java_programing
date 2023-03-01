package day11_StringContinue;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {


        String correctUsername="Cydeo",//literal - this is the correct user name in data and it need to match with the scanner da girilen
                correctPassword = "Woodenspoon";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.nextLine();  // new

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();


        if( username.equals(correctUsername) && password.equals(correctPassword)  ){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }


    }
}
