package utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;
public class Test {
    public static void main(String[] args) {


        System.out.println(Data.d);//static memberslara acces yapabiliyoruz yukarda import yaptik
        System.out.println(Data.e);
        System.out.println(Data.f);


        Data.method3();//static method acces yaptik
        Data.method4();


        Data obj = new Data();//create object to access the instance member of data class

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("---------------------------------------------------");


        //diger pakegeden  alicaz


        System.out.println(AccessModifiers.publicData);//bu public we can access

        // System.out.println(AccessModifiers.protectedData);// burda access yok
        //protected only acceceable under the subclass. onu simdi bilmiyoruz
        //protected out side of pkg not always acceable
        System.out.println(AccessModifiers.publicData); // public is accessible within same package


    }
}
