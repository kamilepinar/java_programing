package day28_OOPEnCapsulation.encapsulation;

import org.w3c.dom.ls.LSOutput;

public class TestEmployeeObject {
    public static void main(String[] args) {
       /* Employee employee1 =new Employee();

        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());


        employee1.setName("Pinar");

        System.out.println(employee1.getName());*/

        Employee employee1 =new Employee("Kasar", 36,"SDET",12000);
 // eger birini yanlis yaparsan o zaman yanlis olan err verir mesela
        //yas -23 olmaz diye ya da isim bos olamaz diye err verir digerleri dogru olsa bile
        //hepsinin dogru olmasi gerek


        System.out.println(employee1);
    }



}
