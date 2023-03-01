package day26_statics;

public class TestIPhoneObject {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println("-----------------------------------------");

       /* System.out.println( iPhone.brand );you dont acces true the object its unnesecary
        System.out.println( iPhone.OS );
        iPhone.printOperatingSystem();*/

        System.out.println("-----------------------------------------------");

        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();


   // when we create custom class method, if we are not going to use any instance we can
        //create static method
        //public static void ....(){ diye it inly except static methods
        //class can not share object members
        //public static void printphone info()
        // bunun altina model yada color cagiramazsin// bunlar object member





    }
}
