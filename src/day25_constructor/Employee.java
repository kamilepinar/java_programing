package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public  String name;//static yaparsan hepsi ayni isimli olur
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    //set info yapmicaz constructer yapcaz
  //right click generatre construster hepsini sec

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }// allows us to set all the instance variables of the object as soon as the object is created


    public String toString() {//allows you to print the object when its pass im the print statement
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }
}
/*
name
age
gender
jobTitle
salary
hired date
 */