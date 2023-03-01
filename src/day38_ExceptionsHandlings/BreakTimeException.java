package day38_ExceptionsHandlings;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){
        super("It's break time");
    }

    public BreakTimeException(String message){
        super(message);
    }


}
