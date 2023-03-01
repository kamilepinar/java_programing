package Day22_arrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {


        String abc = "Java";

        int a1 =10;
        Integer a2 = 10;

        System.out.println("------------------------------------------------");


        int b1 =100;
        Integer b2 =b1; // we can assign directly,  this is AUTO BOXING. once its converted you can use in other data structure


        char ch = 'A';// bunu baska data structure da kullanmak istersen eger
        Character ch1 =ch;

        double d1 = 5.5;
        Double d2 =d1;// autoboxing


        System.out.println("-------------------------------------");

        //UNBOXING

        Integer n1  =20;
        int n2 =n1;
        long n3=n1;// int daha byuk oldugu icin long doubla da convert yapabilirsin ama sen yine own primitivini yap
        double n4 =n1;

        Character e1 ='Z';
        char e2 = e1;
        int e3 =e1; // boylede yapabilirsin ama o zaman numara cikarir. o yuzden aynisini yap hep. own primitivi int int charsa char







    }
}
