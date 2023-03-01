package day28_OOPEnCapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {
        if (name == null) {
            return "unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name can no be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age < 120) {
            System.err.println("Invalid age: " + age);
            System.exit(1);

        }
        this.age = age;

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender: " + gender);
        }
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isBefore(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        }else{
            System.err.println("Invalid DOB");
            System.exit(1);
        }
    }
    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}