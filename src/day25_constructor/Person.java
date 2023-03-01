package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;
    public boolean isMarried;
    public boolean isEmployed;





    public Person(String name, int age, char gender, LocalDate DOB, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +DOB.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }


    public void eat(String food){
        System.out.println(name +" is eating " + food );

    }
    public void sleeping(){
        System.out.println(name + " is sleeping.");
    }
    public void Drinking(String drink){
        System.out.println(name + "  is drinking " + drink);
    }

}
