package day38_ExceptionsHandlings;class CustomCheckedException extends Exception{

}

class CustomUncheckedException extends RuntimeException{

}

public class CustomExceptions extends Exception{
    public static void main(String[] args) {


        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------");

        throw new CustomUncheckedException();



    }



}
