package Day22_arrayList;
import day03_variables.StudentInfo;

import java.util.ArrayList;
public class ArrayListmethods {
    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<>();

        list.add(10);// this is internally converted to integer it means auto boxing
        list.add(20);
        list.add(30);
        list.add(10);
        // you can not give 5,5 double because data types are different.


        list.add(1,15); // boyle yaparak index 1 a 15 rakamini koyduk. simdi sira degisti.10,15,20,30,40 oldu



        System.out.println(list);


        list.add(2,25);
        System.out.println(list);// simdi 25 index 2 ya geldi digerleri bi yana kaydirdi

 //each array lits has it own memory, so two different, and they do not affect the other object
        System.out.println("-----------------------------------------------------");

        ArrayList<String> studentList =new ArrayList<>();
        studentList.add("Mohammed");
        studentList.add("Abdurasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());// total number of element bulmak icin size 4 burda
        System.out.println(studentList);

        //if you call get method from string   it will return string if its int it will return int

        String firstStudent = studentList.get(0);// first element of this string
        String lastStudent =studentList.get(studentList.size() -1);
        //in the array you use length in array list it name size just different method name

        System.out.println(firstStudent);
        System.out.println(lastStudent);


        System.out.println("_____________________________________________");




    }
}
