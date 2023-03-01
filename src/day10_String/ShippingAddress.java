package day10_String;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);


        System.out.println("please enter your  full name");
        String fullName = input.nextLine();


        System.out.println("Enter your building number: ");
        String buildingNumber=input.next();


        input.nextLine();//clar the scannr nelinedan once next gelmis cunku

        System.out.println("enter your street name: ");
        String streetName= input.nextLine();

        System.out.println("enter your city");
        String cityName = input.nextLine();

        System.out.println("enter your state name");
        String stateName =input.nextLine();

        System.out.println("enter your zip code");
        String zipCode = input.next();


      /*  System.out.println("your_full= " +fullName);
        System.out.println("your building number = " +buildingNumber);
        System.out.println("your street name = "+streetName);
        System.out.println("your city name =" + cityName);
        System.out.println("your state name = "+stateName);
        System.out.println("your zip code= "+zipCode);*/

        System.out.println("------------------------------------------");

        System.out.println("Your Shipping Adress is: ");
        System.out.println("\t" +fullName);
        System.out.println("\t" + buildingNumber+"" +streetName);
        System.out.println("\t" + cityName +","+stateName+" "+zipCode);



        /*Your Shipping Adress is:
	Pinar Okatar
	13818Sunshowers
	Orlando,Florida 32828*/



        input.close();






    }
}
