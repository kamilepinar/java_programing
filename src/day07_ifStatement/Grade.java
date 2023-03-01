package day07_ifStatement;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';

        String result ="";

        if(grade == 'A'){
            result = "Excelent";
        }
        if(grade == 'B'){
            result = "Great Job";
        }
        if(grade == 'C'){
            result="Good";
        }
        if(grade == 'D'){
            result = "passed";
        }
        if(grade == 'F'){
            result = "Failed";
        }
        System.out.println(result);






    }
}
