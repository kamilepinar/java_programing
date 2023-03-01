package day06IfStatements;

public class IdentifyNumber {


    public static void main(String[] args) {

        //if number negative positive or zero
        // then you write the expression to say if i positive true or false


        int number = 100;

        boolean isPositive = number >0;
        boolean isNegative = number<0;
        //boolean isZero = number == 0; there is another way to write zero
        // boolean isZero = !isPositive || !isNegative;// not positive or not negative so its zero.

        boolean isZero = !isPositive && !isNegative; // and expression


        System.out.println(number + " is positive number: " + isPositive );//true
        System.out.println(number + " is negative number: " + isNegative );//false
        System.out.println(number + " is zero: " + isZero );//false




    }
}
