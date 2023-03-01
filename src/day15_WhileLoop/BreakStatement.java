package day15_WhileLoop;

public class BreakStatement {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if(i==6){// if i s value reaqch 6  that its exit the loop and it will only print 12345
                break;
            }

            System.out.println(i);

        }


        System.out.println("-----------------------------------");

        for (char i = 'A'; i < 'z'; i++) {// it will print A to Z

            if (i == 'J') {
                System.out.println("Loop is teminated");// with this it will only print to J
                break;
            }

            System.out.println(i);
        }

                for (;;) { // this is the infinite loop
                    System.out.println("Hello");
                    break;// forcefully exiting the loopp so it will only print one time
            }












    }
}
