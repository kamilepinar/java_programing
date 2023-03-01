package day09_Scanner;


import java.util.Scanner;// assagiya scaner yazip enter yaparsan burasi otomatik geliyor

public class ScannerIntro {
    public static void main(String[] args) {


       //new yaz space enter otomatik scaner yaziyor

        Scanner input = new Scanner(System.in);// this is how you creat scaner for reading user inputs



        System.out.println("enter your first  number: ");

        byte num1= input.nextByte();//nextbyte bu byte girilmesine izin verir 127 ye kadar


        System.out.println("enter your second number: " +num1);

        short num2=input.nextShort();


        System.out.println("enter your third number");
        int num3 =input.nextInt();

        System.out.println("enter your fourt number");
        long num4 =input.nextLong();

        input.close();//scvanner is closed and can not  read user inputs again

        System.out.println("first number: " +num1);
        System.out.println("second number " +num2);
        System.out.println("your third number " +num3);
        System.out.println("your fourth number" + num4);

        input.close();

    }
}
