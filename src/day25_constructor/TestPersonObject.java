package day25_constructor;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person first = new Person("Pinar",36,'F', LocalDate.of(1985,12,20),true, true);
        Person second = new Person("Murat", 42,'M',LocalDate.of(1980,11,10),true,true);
        Person third = new Person ( "Emre",36,'M', LocalDate.of(1986,06,21),false,false);
        Person fourth = new Person ("Ayse",40,'M',LocalDate.of(1982,01,12),false,true);
        Person fifth = new Person ("Austin",35,'M',LocalDate.of(1987,07,01),false,true);


        String food = "apples";
        String food1 = "nuts";
        String drink = "water";
        String drink2 = "coffee";

        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println(third.age);
        System.out.println(fourth.DOB);
        System.out.println(fifth.isEmployed);


        first.eat(food);
        second.Drinking(drink);
        third.sleeping();
        fourth.eat(food1);
        fifth.Drinking(drink2);



    }
}
