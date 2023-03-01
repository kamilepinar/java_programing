package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {


        System.out.println("program1 is started");

        int[] arr = { 1,2,3,4};
        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); // display full details of the exception after the execution of program
        }


        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();

        }


        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }//bu daha kisa mesaj verir

        System.out.println("Program3 ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program2 started");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program3 ended");


    }
}
