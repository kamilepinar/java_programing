package day08_ternary_switch;

public class TenaryIntro3 {
    public static void main(String[] args) {

        int score = 130;

       /* String result="";

        if(score>= 0 && score<=100){
            if(score>=60){
                result = "passed";
            }else{
                result = "failed";
            }


        }else{
            result ="invalid";

        }


        System.out.println(result);*/
        String result=(score >=0 && score <=100)? // this is the pre condition for nested if, if false it will be invalid
                (score>=60)?"passed":"failed"
                :"invalid";
        System.out.println(result);

        System.out.println("---------------------------------------------------");

        int n=5;
        String day =(n>=1 && n <=7)?
                (n==1)?"monday": (n==2)?"Tuesday":(n==3)?"wednesday":(n==4)?"thursday":(n==5)?"friday":(n==6)?"saturday"
                        :"sunday"
                :"no such a day";
        System.out.println(day);





    }
}
