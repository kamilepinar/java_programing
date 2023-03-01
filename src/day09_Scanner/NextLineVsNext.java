package day09_Scanner;

import java.util.Scanner;

public class NextLineVsNext {
    public static void main(String[] args) {


        //if you enterr nexline method after other method it will give issue and it wont give you entery it will show empty
        Scanner input = new Scanner(System.in);

        System.out.println("enter your age: ");
        int age = input.nextInt();


        input.nextLine();// bunu koyarsan eger memoryde kalan enter i bu alir bi sonrakide type yapmaya izin verir
        System.out.println("enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("age= " + age);
        System.out.println("full name= " +full_name);
        input.close();






    }
}
