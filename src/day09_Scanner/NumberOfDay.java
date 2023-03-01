package day09_Scanner;

public class NumberOfDay {

    public static void main(String[] args) {

        int month = 15;

        String result = "";

        //if you want use something 'equal' to something you should use swith
        // but  if you need some thing range && or operator you should always go with switch
        switch(month){
            case 2:
                result = "28 days";
            case 1: case 3:case 5:case 7:case 8:case 10:case 12://this is or logic , you can do and logic in switch
                result="31 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result ="30 days";
                break;


            default:
                result="invalid number";
        }




    }
}
