package day08_ternary_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {
        //multi branch if  in ternarye ceviriyoruz.

        int number =100;
        //we need to get postive negative or zero. hepsi string ile yapiliyor
        // bu temporary value


        //eski hali bu
       /* If(number>0){
            result = "positive";
            }else if(number<0){
            result =" negative";
            }{else{
            result = "zero";

        }*/
        //if this not printing more than one statement we can use ternary(mesela postive)

        //String result = (number >0)? "Positive" :(number<0) ?"Negative" : "zero";

         //             condition- if-vercegi value-else if:? ama condition ? once gelmesi gerek
        //  iki? iki : colon var bunlarin sayilari ayni olmak zorunda


       // System.out.println(result);

        System.out.println("----------------------------------------------------------------");
        int n =2;
      String result = (n == 1) ? "monday" : (n == 2) ? "tuesday" : (n == 3) ? "wednesday" : (n == 4) ? "Thursday" : (n == 5) ? "friday"
                : (n == 6) ? "saturday" : "sunday";



        int num=10;
        String month = (num==1)? "January":(num==2)?"February":(num==3)?"March":(num ==4)?"April" : (num==5)?"May"
                :(num==6)?"June" :(num==7)?"July" :(num==8)?"August":(num==9)?"September" :(num==10)? "September"
                :(num==11)?"november" :"Decembre";


        System.out.println(month);




    }
}
