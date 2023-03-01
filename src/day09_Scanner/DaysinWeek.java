package day09_Scanner;

import java.util.Scanner;

public class DaysinWeek {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);


        System.out.println("enter the day number");
        int num = input.nextInt();


        String day="invalid";

        if(num>=1 && num<=7){
            day=(num==1)?"monday":(num==2)?"tuesday" : (num==3)?"wednesday":
                    (num==4)? "Thursday" :(num==5)?"Friday":(num==6)? "Saturday":"sunday";

        }

        System.out.println(day);

        input.close();


    }
}
