package day06IfStatements;

public class EvenlyDevisible {

    public static void main(String[] args) {

        // we need toi write a code is its devisible by 2,3,5 ? and write a boolean

        int number = 65;

        boolean isDivisibleBy2 = number %2 == 0 ;//if the remainder of number divided by 2 is equal to zero
        //then its evenly divisible by 2

        boolean isDivisibleBy3 = number %3 == 0;

        boolean isDivisibleBy5 = number %5 ==0;

        //lets check them

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);// 65 can not divisible by 2 so result is false

        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);// false

        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);// true

        // number 45 olsaydi ikisi dogru olurdu, yada  30 olsaydi hepsi true olurdu.





    }
}
