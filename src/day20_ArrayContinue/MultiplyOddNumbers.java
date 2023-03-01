package day20_ArrayContinue;

import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {


        int []numbers = {1,2,3,4,5,6,7,8,9,10};
        // we want to change all the odd number in that array and multply them

        // first check which are odd numbers:
        // how can we iterate this numbers?
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0 ){
                continue;
            }
            numbers[i]= numbers[i] * 2; // this is how you get the elements from the index number
           // this will be multiple every number but we want only odd number
        }

        System.out.println(Arrays.toString(numbers));// when you diclare array you have to put like that








    }
}
