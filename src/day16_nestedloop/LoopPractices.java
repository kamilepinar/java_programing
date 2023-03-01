package day16_nestedloop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++ ){

            System.out.println("Hello " + i);

        }

        System.out.println("---------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }

        System.out.println("---------------------------------");

        int j = 0;
        while(j < 5){
            System.out.println("Hello "+j);
            j++;
        }


        /*
        int j = 0;
        while(j < 5){
            System.out.println("Hello "+j);
            j++;
        }
        */
    //number of iteration fix ise for loop if its not fixed you use while loop
        System.out.println("---------------------------------");

        int k= 0;// buu while ile yapabiliorsun ama en okunuru for loop eger sayi belliyse for loop
        do{
            System.out.println("Hello "+k);
            k++;
        }while(k < 5);

        System.out.println("----------------------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        while(score > 100 || score < 0){ // while the score is invalid, we will repedetly ask user to entery
            System.out.println("Invalid score, please re-enter your score ");
            score = input.nextInt();
        }


        if(score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }







    }
}
