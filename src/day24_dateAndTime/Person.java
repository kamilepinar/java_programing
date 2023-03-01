package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    //today date- birthday  we can calculate the age


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {//burda cikan person ismini silip void set info yaziyosun
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();// bu local variable degil kendimiz bulcagimiz icin this cagirmaya gerek yok








    }
}

