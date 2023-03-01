package day35_polymorphism;

import day31_Inheritance.shape_methodOverriding.Circle;
import day33_Abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {


         Dog dog =new Dog("Max","husky",'M',4,"Small","White");

         Cat cat= new Cat("max","husky",'M',4,"Small","White");


        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};
           // reference type Animal variabl larina aces yapabilir sadece,its get dog object implementation
        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //  animal.play();
        //  animal.bark();


        System.out.println("---------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Teacher teacher = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);


        Object[] objects = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, driver, tester};//as log as its object
        // we can store in  reference

        System.out.println(Arrays.toString(objects));

        Object[] employees = {teacher, developer, driver, tester};//this is Object class reference en baba olucak
        ////only sport employee, you can only call what ever the reference type has


        Employee obj = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);//only sport employee
        obj.work();//drivin is driving dicek simdi cunku object is driver, object type is decide what it s doing
        // eger obj daha baba olani reference gosterirssen work methodu kullanamazsin ama eger employee class gosterirsen onda work method var
        //daha specific olani secmen gerek

        //Employee obj2 =new Teacher("james",48,'M', A1);
        //obj.work();// teacher is teaching olucakti o zaman


        System.out.println("------------------------------------------------------------");








    }
}
