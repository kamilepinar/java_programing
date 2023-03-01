package day15_WhileLoop;

public class RemoveDuplicates2 {


    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+ str.charAt(i) )){
                continue;
            }
            result +=str.charAt(i);// every single charakter will be comcate to the string
        }

        System.out.println(result);


        System.out.println("====================================");
        // find the sum of all the even number between 50-100

        for (int i = 50; i <101 ; i++) {
            if (i % 2 == 0){

                System.out.println(i+" ");
            }

        }


        //50,52,54,56,.....100
        for (int i = 50; i < 101 ; i++) {
            System.out.println();
        }

        System.out.println();

        for (int i = 50; i < 101 ; i++) {
            if (i % 2 == 1 ){// if the odd value is odd number !=0 da odd
                continue;
            }
            System.out.println(i+" ");

        }


    }
}
