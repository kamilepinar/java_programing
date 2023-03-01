package day05_operators;

public class unaryOperator {


    public static void main(String[] args) {


        // pre increment will increase or decrese the value right away.

        int x = 10;
        System.out.println(++x);// it will give 11and next x will be 11 too
        System.out.println(x); //



        int b =25;
        System.out.println(b--);// it not change the value immidiatly // its 25
        System.out.println(b);// it now 24


        int a = 50;

        System.out.println(a++);// 50
        System.out.println(a);// now 51



        int n =30;

        int m = n++; // m will be first 30 m=30
        System.out.println(m);
        // it s passing the old value to m soo n will  be 31.
        System.out.println(n);// shows 31





    }
}
