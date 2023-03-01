package day12_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {


        maxNum(10.5, 20.5);


        maxNum(134567576, 456678890);

        //maxNum cagir class icin main disindas yaptigin kod ile bunu kisaca yapiyo

        // bu diger methodla yaptigin
        initial("pinar","okatar");


    }
// create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)

    public static void maxNum(double num1, double num2){
         if (num1> num2){
             System.out.println(num1 + " is the maximum number");
         }else if ( num2>num1){
             System.out.println(num2 +" is maximum number");
         }else{
             System.out.println("Equal");
         }
    }



    public static void initial(String firstName, String lastName){
        String initial = firstName.toUpperCase().charAt(0) + "."+ lastName.charAt(0);
        System.out.println("Initials is :" + initial );
    }


}
