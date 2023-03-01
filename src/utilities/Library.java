package utilities;

public class Library {

    public static void sleep(double seconds){//sleep pause the executing.in the sleep method it take argument as millisecnd
        try {
            Thread.sleep( (long) (seconds * 1000) );//it take milisecnd and when we multiple by double second it gives double so we cast to long because it take long arg
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //if we declare the thorwas keyword who ever call this method will get exception because trow handle it temporary, so we will need try catch
}
