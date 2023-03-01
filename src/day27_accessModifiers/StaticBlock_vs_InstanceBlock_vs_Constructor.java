package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor()
    {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("main Method");


        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();

    }


}
 /*
 * burda ilk satatic block sonra main method execute olur
 * diger iki block olmuyor cunku it depende on object burda da object olmadi icin execute olmadi digerleri
 * static block static olan objectler icin kullanicaz
 *
 * constructer yada instance block olmasi icin new contucter block objesi yazman gerek o zaman  execute yapar
 * main methodun icine koyunca new o zaman sirasi static main instance contructer oluor
 * ikinci obje koyunca  yine once static /  main  /   instance block/ constructer block/ instance block/consturter block*/