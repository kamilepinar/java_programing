package day38_ExceptionsHandlings.ShapeTask;

public class InvalidShapeException extends RuntimeException {
    public InvalidShapeException(String message){
        super(message);
    }
}
