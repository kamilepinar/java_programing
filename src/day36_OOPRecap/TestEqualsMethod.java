package day36_OOPRecap;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        //System.out.println(circle1== circle1);// false verir cunku memoryde yerleri farkli

        System.out.println(circle1.equals(circle2));//true
        //burda Circle classda parameter object baba, o yuzden circle2 koyabildik


        System.out.println(circle1.equals(circle3));//false// parent classdaki equals method ile yaptik bunlari




        System.out.println("----------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "White", 900);


        System.out.println( iphone1.equals(iphone2) );//iphone2 yerine baska bir objectte olsa error vermez cunku super classda parameter object baba
        //ama cast acception verir



    }
}
