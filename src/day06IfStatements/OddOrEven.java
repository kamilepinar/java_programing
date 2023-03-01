package day06IfStatements;

public class OddOrEven {


    public static void main(String[] args) {


        int number =45;
        boolean isEven = number % 2 == 0;
        //when we divide a number by to if the remainder is zero it means the number is even number.

        boolean isOdd = number % 2 != 0;
        // which means is , if the number is divided and remainder is not equal zero, its odd number.


        System.out.println(number + " is an even number: " + isEven );// 45 is not even so result false
        // if you change the number variable to 100 the result will be true

        System.out.println(number + " is an odd number: " + isOdd );
        // now this expression will be true for 45
        // you have to write 2 different expression to for odd and even






    }


}
