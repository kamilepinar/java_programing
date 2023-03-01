package day27_accessModifiers;

public class StaticBlock {
    public StaticBlock(){//bu constructer
        System.out.println("constructor");
    }
    static {
        System.out.println("static block");//bu herzaman ilk once execute olur


    }

    public static void main(String[] args) {
        System.out.println("main method");//ikinci main method

        new StaticBlock();//bunlar constructeri execute yapiyo yani 3 kere print yaptirir
        new StaticBlock();//ucuncu bunlar cikiuyor constructer
        new StaticBlock();



    }



}
// ilk once hep static block excecute olur daha sonra main method excecute olur
/**/