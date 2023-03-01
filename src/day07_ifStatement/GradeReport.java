package day07_ifStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95; // 0 ~ 100

        String result = "";

        if(score >= 90){ // false: score < 90// ilk verilen if false ise bi sonrakine gidiyor
            result = "A";
        }else if(score >= 80){ //false: score < 80
            result = "B";// && statement yapmana gerek yok cunku by default yani else if bunu otomatik yapiyor.
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }


        System.out.println("Your grade is: " + result);



        /*
 An integer variable named score is declared and given, Write a program that can print the grade of the student
	Ex:
		score = 95
	     output:
		    Your grade is A
	 Note: Assume that the given score is between 0 ~ 100
 */

    }
}
