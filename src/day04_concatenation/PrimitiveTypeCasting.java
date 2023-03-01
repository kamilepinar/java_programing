package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        // implicit casting = smaller primitive assigning to larger one

        byte a = 15;
        short b = a;

        System.out.println(b);
        int c = a; //implicit casting

        long d =3000l;
        float f = d; // this is implicit casting


        // ========explicit casting========
        int x =100;
        // byte y= x; boyle yaparsan error verir
        //byte y = (short)x; yapamazsin cunku short is larger than byte, larger primitive can not be assign to smaller directly
        // if your need to assign one type to another () casting aparati you need to write the same time

        byte y = (byte) x; // that is explicit casting

       // float z =20.8; // that is double range so you need to add f to make compiler take it as float value
        float z = 20.8f;
        short q =(short)z; // z=20.8 if you assign float to short it will only give integer value which means=20
        System.out.println(q);


        double n1 = 2.5;
        byte n2 = (byte) n1; // n1=2.5; but as byte it will only show as 2


        System.out.println(n2);



        int num =500;
        byte result = (byte) num; // explicit casting


        System.out.println(result); // if you try to cast larger to smaller you will get minus number

        int r =50000;
        short t= (short) r; // it will give bigger - numbers
        System.out.println(t);

        double u = 3000.5;
        int p =(int) u ; // explicit casting

        System.out.println(p);

        int o = 100;
        double d1 = o;
        // even you addign intiger number it will give you decimal number which is 100.0

        System.out.println(d1);





    }
}
