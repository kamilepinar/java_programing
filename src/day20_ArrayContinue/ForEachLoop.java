package day20_ArrayContinue;

public class ForEachLoop {
    public static void main(String[] args) {


       int[] numbers ={10,2,30,40,50};
       for (int i = 0; i < numbers.length; i++){
           System.out.println(numbers[i]);
       }


        System.out.println("-----------------------------");

     //for key word : seperate the data structure and variable. on the right side need to give data sctructur burda number yani
        //iteration order will be fixed when you give data structer, burda 5 time not more not less, and first element to last element
        // this order you can not change, order or number is fixed on for each loop
        // those int will assign by one by


        for(int each : numbers){
            System.out.println(each);// you dont need to worry about iteration, initialization vs. it will get you every single element
            //that is the advantage of for each loop and it would be a lot more simply
            // disadvantage is reverse yada starting from middle yapamazsin
        }



    }
}
