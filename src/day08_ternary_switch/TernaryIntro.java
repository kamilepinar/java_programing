package day08_ternary_switch;

public class TernaryIntro {


    public static void main(String[] args) {

        int score =85;
        String result = "";

        if(score>=60){
            result="Passed";
        }else{
            result="Failed";
        }
        System.out.println(result);
        System.out.println("-------------------------------------");

        String result2 =(score>=60) ? "passed" : "FAiled";

        System.out.println(result2);

        System.out.println("-----------------------------------");




        // notlar uzun digerleri ternary kisa hali
       // String r;


        //if(age>=34);

        //if(age>=21){ // bu
         //   r = "Eligible";
        //}else{
         //   r="Not eligible";


            // ? means if /: means else. / and conditions  always come first and value of if comes after question mark?

        // assagidaki if and else statementin ternarye cevrilmis hali. ternary sadece bir value verir pass yada fail gibi daha uzun olmaz
          int age =34;


        String results3 =(age>= 21) ? "Eligible" : "Not eligible";
            System.out.println(results3);







        }





    }

