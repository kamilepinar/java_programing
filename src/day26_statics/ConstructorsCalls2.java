package day26_statics;

public class ConstructorsCalls2 {
    public ConstructorsCalls2(){ // Default
        System.out.println("Default");
    }

    public ConstructorsCalls2(int a){  // Default, int arg
        this(); // calling the default constructor// o yuzden default icine int valuesu veremeyiz kendini cagirmis olur oda kabul etmez
        System.out.println("int arg");
    }

    public ConstructorsCalls2(String a){ // Default, int arg, string arg
        this(10); // calling the constructor with int arg
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorsCalls2 obj1 = new ConstructorsCalls2();//it will print "Default"

        System.out.println("--------------------------------");


        ConstructorsCalls2 obj2 = new ConstructorsCalls2(10);//it will print " int Arg"

        System.out.println("---------------------------------");

        ConstructorsCalls2 obj3 = new ConstructorsCalls2("Java"); //



    }

}
