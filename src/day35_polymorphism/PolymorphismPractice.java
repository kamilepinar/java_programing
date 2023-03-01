package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.TransportationTaskAbstraction.*;

public class PolymorphismPractice {

    public static void main(String[] args) {



        Animal tiger =new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();// burda polymorhizm yok o yuzden hunt method tiger class da var ama Animal yazsan o zaman huntmethod olmuyor

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly();//reference type class Eagle olsaydi bunu da cagirirdik. ama burda poly var ve Animal baba class da fly yok
        animal.eat();
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");;
        //obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();//reference type Animal olsaydi bu ikisini cagirmazdik
        System.out.println(obj1.canFly);


        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot, eagle, duck};// bunlar sadece ucabilen digerlerini kabul etmez //is a relation ship olanlar sadece

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};//dog cat duck bunlarda playeble interface oldugu icin reference onu gosterebildik
     //either parent class  or the interface ortak olan olmasi gerek poly de

        boolean isAnimal = dog instanceof Animal;//true // is a relation ship yoksa instanceof yazinca error verir

        System.out.println(isAnimal);//false // bu niye false oldu anlamadim

        System.out.println("------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;//burdaki obje car teslami
        boolean isAudi = car instanceof Audi;//burdaki objec car audi mi

        boolean isElectricCar = car instanceof Electric; //bu obje electricle alakalimi
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla);//true
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);

        System.out.println("------------------------------------------------");

           // bu instance of keyword hangi object hangi classa ait gorebilmek icin kullaniyoruz






    }







}
