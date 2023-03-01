package day04_concatenation;

public class ShippingAddress {


    public static void main(String[] args) {

        String name = "Aaron ";
        String lastName = "Kissinger";
        String fullName = name + " " + lastName;
        String buildingNumber = " 13621A";
         String streetName = " Legacy circle";
         String city = " Fairfax";
         String state = "VA ";
         String zipcode = "22030";


        System.out.println("Your shipping address is: ");
        System.out.println("\t"+ fullName);
        System.out.println("\t"+ buildingNumber + " " + streetName);
        System.out.println("\t"+ city + ", " + state + " " + zipcode );





        // lets do it in one line

        System.out.println(" Your shipping address is:\n\t" + fullName + "\n\t" + buildingNumber + " " + streetName + "\n\t" + city + ", " + state
        + zipcode);




    }

    }