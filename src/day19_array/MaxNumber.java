package day19_array;

public class MaxNumber {

    public static void main(String[] args) {


        int [] numbers = {100,20,500,40,-10,30};
        int max = numbers[0];//this is assumption, you compare first to second then third forth fifth
// with array you dont need to assign smalest int -2146768 just use the first element yani index 0 and compare the rest
        for (int i = 1; i < numbers.length; i++) {// zero ile compare yapicagin icin baslangic noktasina 1 verdi
            if(numbers[i] > max){// this will be replacing current max value
                max=numbers[i];//replace current max number
            }

        }

        System.out.println("max = "+max);

        System.out.println("---------------------------------------------");
        // min bulmak icin sadece kucuktur isaretini degistirdik
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min){
                min=numbers[i];
            }

        }

        System.out.println("min" + min);



    }
}
