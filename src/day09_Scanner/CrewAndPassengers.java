package day09_Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {




        int number = 75;
        String result = "";

        boolean validNumber =  number == 50 || number == 75 || number ==100;

        if(validNumber){ // number: 50, 75, 100

            if(number == 50){
                result = "20 crew, 30 passengers";
            }else if( number == 75){
                result = "25 crew, 50 passengers";
            }else{
                result = "30 crew, 70 passengers";
            }

        }else{
            result = "Invalid Number";
        }



        String result1=(number == 50 || number == 75 || number == 100)?
                (number ==50)?"20 crew,30 passengers"
                        :(number == 75)?"25 crew,50 passengers"
                        :"30 crew,70 passengers"
                :"invalid";
        System.out.println(result1);



        String result3 = "";// switch does not accept boolean expresiion.
        switch(number){
            case 50:
                result3 ="20 crew,30 passengers";
                break;
            case 75:
                result3="25 crew,50 passenger";
            case 100:
                result3 = "30 crew, 70 passenger";
            default:
                result3 = "invalid";
                // no need break for default. you can put on somewhere in middle but you have to put break and its not recomend

                System.out.println(result3);
        }












    }
}
