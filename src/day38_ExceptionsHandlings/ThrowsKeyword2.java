package day38_ExceptionsHandlings;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {
       // method1();//now the responsibity in the main so we again call throws keyword

        Library.sleep(2.5);
    }


    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();//this is interupted exception because its still there not handle in the method.
        //so either you gona use the throws keyword again but if you call the method it will get exception again
        // so repossibility go to caller of the method,
        System.out.println("Hello Cydeo");
    }
    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");


        Thread.sleep(5000);


    }

    }

