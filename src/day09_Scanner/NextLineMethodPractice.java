package day09_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // iki next line arka arkaya olunca araya enteri alan bir next line koymana gerek yok


        System.out.println("enter your full name");
        String full_name = input.nextLine();

        System.out.println("enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("enter your gender: ");
        String gender = input.next();//suppose you enter male+enter


        System.out.println("provide your age :  ");
        int age = input.nextInt();//it can only read till 28 and enter will be left on the memory

        input.nextLine();//bu kalan enterlari memoriden aliyor sonrakine yazmasi icin firsat veriyor

        System.out.println("provide your street adress");// burdanexline kullanicaksin ama kendinden baska methodlar once
        // geldigi icin bunun arasina bir tane daha koymamiz gerek
        String street =input.nextLine();

        input.close();


    }
}
