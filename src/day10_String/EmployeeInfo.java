package day10_String;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);

        System.out.println("enter your  full name");
        String fullName= input.nextLine();

        System.out.println("enter your age");
        Byte age = input.nextByte();

        System.out.println("enter your gender");
        char gender =input.next().charAt(0);

        input.nextLine();

        System.out.println("enter your company name");
        String companyName= input.nextLine();

        System.out.println("enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("enter your salary:");
        double salary = input.nextDouble();






        System.out.println("Full name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("Gender:"+gender);
        System.out.println("Company name: "+companyName);
        System.out.println("job title: "+jobTitle);
        System.out.println("salary: "+salary);

        input.close();






    }
}
