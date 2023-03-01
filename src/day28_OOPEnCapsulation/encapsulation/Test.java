package day28_OOPEnCapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
       // student.age = -200;


      //  System.out.println(student.age); boylede cagiramiyoz

        student.setAge(28);
        System.out.println(student.getAge());

        student.setName("Pinar");// bunu vermezsen name has not been set err mesg cikar

        System.out.println(student.getName());



    }
}
