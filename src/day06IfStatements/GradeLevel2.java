package day06IfStatements;

public class GradeLevel2 {
    public static void main(String[] args) {

        // instead of printing multiple print statement for if statements we can write only one string print (sout)

        int gradeLevel=16;

        String result = ""; // temporary value


        if (gradeLevel >=1  && gradeLevel<=5){
            result = "Elementry School";
        }

        if (gradeLevel >= 6  && gradeLevel <=8){
            result = "Middle School";
        }

        if(gradeLevel >=9  && gradeLevel <=12){
            result = "High School";
        }
        if (gradeLevel >=13  && gradeLevel<=16){
            result = "College";
        }
        if (gradeLevel >=17  && gradeLevel<=18){
            result = "Grad School";
        }

        // with this result we didnt use print statements we just use the result to contain the value to show the result later

        System.out.println(result);





    }





}
