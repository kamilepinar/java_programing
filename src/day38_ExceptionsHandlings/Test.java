package day38_ExceptionsHandlings;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    //this is our own custumize sleep method
    public static void main(String[] args) {


        System.out.println("Hello Cydeo");

        //Thread.sleep(3500);
        Library.sleep(3.5);
        System.out.println("How Are you today?");

        System.out.println("---------------------------------------");

        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();
        }

        //  throw new RuntimeException("Something went wrong");

        throw new BreakTimeException("Time to go home");
        //you must create construct with argument in the parent class(breaktime exception class)

        //   throw new BreakTimeException();//default will be it is break time from parents






    }
}
