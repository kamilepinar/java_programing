package day27_accessModifiers;

public class TestCydeoStudentObjects {


    public static void main(String[] args) {
        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1= new CydeoStudent("Pinar",37,'F');//bunlar instance variable constructer ile create yapiliyort
        CydeoStudent student2 =new CydeoStudent("Emre",36,'M');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);//static method calling from object is not a legal way
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);






    }
}
