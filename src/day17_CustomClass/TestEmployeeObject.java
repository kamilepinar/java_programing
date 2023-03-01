package day17_CustomClass;

public interface TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Sumeye", 28, 'F', "Java Developer", 95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar", 29, 'M', "Back-end Developer", 98000, "B13");

        Employee employee3 = new Employee();
        employee3.setInfo("Abidullah", 30, 'M', "Front-end Developer", 99000, "C14");

        Employee employee4 =new Employee();//this are instance name age gender
        employee4.setInfo("Kamile",37,'F',"Front-end Developer",92000,"A9");

        employee2.age = 39;

        employee3.name = "Lucy";
        employee3.gender = 'F';


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


        employee3.work();// this is instance method

        employee4.work();



    }








}
