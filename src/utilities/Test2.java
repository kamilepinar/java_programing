package utilities;
import static day27_accessModifiers.Data.*;// bu butun staticleri cegirir
public class Test2 {

    public static void main(String[] args) {

        // System.out.println(Data.d);

        System.out.println(d);

        method3();//yukarda imprt oldugu icin direk method name ile cagirabiliyoruz

        System.out.println(e);
        System.out.println(f);

        method4();


        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        method1();
        method2();//static import  bu instant lari import yapmiyor
        */

    }

}
//import day27_accessModifiers.Data; hepsi
//import static day27_accessModifiers.Data.d;
//import static day27_accessModifiers.Data.method3;
//import static day27_accessModifiers.Data.d;
//import static day27_accessModifiers.Data.e;
//import static day27_accessModifiers.Data.f;
//import static day27_accessModifiers.Data.method3;
//import static day27_accessModifiers.Data.method4;


    //import only static member of another class
    // System.out.println(Data.d);boyle cagirmana gerek kalmaz


    //* koyarsan butun static memberslari cagirabilirsin bu class basinda yaptigin
   //import day27_accessModifiers.Data; bu hepsini cagirir
