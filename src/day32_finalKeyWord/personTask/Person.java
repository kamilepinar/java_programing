package day32_finalKeyWord.personTask;

import java.time.LocalDate;

public class Person {// its parent class can not be final because final can not extend

    private String name;
    private final char gender;//only  this will be final conrocter and setter will be public again
    private final int age;
    private final LocalDate dateOfBirth;// there is no defaul value o yuzden you have to initialize or you will get complie error

    public static final int numberOfHead;
    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);// we just need to put ondition on this one
        if( !(gender=='M' || gender == 'F')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;// no condition need this. olur.
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();//age will be auto set

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public final void breath(){ // To make sure that this implementation will not change for any sub class
        System.out.println(name +" is breathing");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth= " + dateOfBirth +
                '}';
    }


}

/*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead
Methods:
    eat(), drink(), sleep()
    breath()
 */


