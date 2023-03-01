package day06IfStatements;

public class SingleIfStatementpractice {

    public static void main(String[] args) {


        int number = 155; // is it odd or even?

        boolean isEven = number % 2 ==0;

        if (isEven){

            System.out.println("even number");
        }

        if (!isEven){

            System.out.println("odd number");
        }

        // ikincii dogru oldugu icin ilkini degil odd number yazIyor consolda.

        System.out.println("===============================================");

        // you can direcly apply the boolean variable to if statements

        if(number % 2 ==0){

            System.out.println("Even number");
        }

        if (number % 2 != 0){

            System.out.println("Odd number");
        }// 155 verilen buna uydugu icin bu cikiyor








    }
}
