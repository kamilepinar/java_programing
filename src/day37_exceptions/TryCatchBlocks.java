package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program Started");
        try {
            System.out.println(9 / 0);//program get termonated in this line and alttaki program ended cikmaz
            System.out.println("tRy Block");
        }catch(ArithmeticException e){ // buraya Run time daha gelebilir cunku aritmetik is run time excption. parent can handle also
            System.out.println("catch Block");

        }
        System.out.println("Program Ended");

  //try block couldnt handle the exception so catch block catch and handle the exception so catch block get be executed



        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {

            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch (RuntimeException e){// yukardaki bizi error vermedi parent of uncheck exception runtime koyduk/Exception grandpa da konulabilir yada Throwable grandma da olur
            // ama buyuk babalari koyarsan compiler icin daha uzun islem run time demek o yuzden azaltmaya calisiyoruz ama best solution run tine bilmiyorsan problemi
            System.out.println("Catch Block");
        }


        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------------");



        System.out.println("Program3 started");

        try {

            Thread.sleep(5000);
            System.out.println("Try Block");

        }catch (InterruptedException e){

            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");








    }
}
