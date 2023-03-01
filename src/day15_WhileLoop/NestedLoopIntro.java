package day15_WhileLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {// bunlarin her biri bes kere print yapar
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
       // instead of writing over and over we can write nested loop,, loop is for repeading
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < 5; i++) { //i : 0  // buda kisa yoldan 5 *5 yapar. uste ki her bir yaptiginda alttaki bes yapar toplamda 25

            for (int j = 0; j < 5; j++) {
                System.out.println("Wooden Spoon");
            }

        }




    }
}
