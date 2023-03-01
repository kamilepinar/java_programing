package day16_nestedloop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition ;){
            System.out.println("Hello Cydeo   --- For Loop");
        }

        System.out.println("-------------------------------------");

        while(condition){
            System.out.println("Hello Cydeo  --- While Loop");// if condition false never get executed
        }

        System.out.println("-------------------------------------");

        do{
            System.out.println("Hello Cydeo  --- Do&While Loop");//statements check first even condition false it will get executed one time
        }while (condition);// if loop conditions true it will repet
        // in same senenoria even its even it false statements need to repeted one time, it rare but you might need
        // you mostly use for or while loop//  login ornegine bak




    }
}
