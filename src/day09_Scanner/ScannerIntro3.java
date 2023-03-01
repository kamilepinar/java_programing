package day09_Scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a Character: ");

        char ch =input.next().charAt(0);
        System.out.println("you have entered: " +ch);




        System.out.println("would you like to continue?");

        //String answer = input.next();//sadece bir kelime veriyor nextline bir line vriyor

        String answer = input.next();
        System.out.println("you have entered:" + answer);
        input.close();





    }
}
