package day28_OOPEnCapsulation.personTask;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 =new Person("Muhammed");

        Person person2 = new Person("Abdullah",'M');

        Person person3 = new Person("Hasan",30);

        Person person4 =new Person("Daniel","English");

        Person person5 =new Person("Tatiana",25,'F');

        Person person6 = new Person("Lucy",31,'F',"English");

        person4.name = "James"; //name is instanc and now you change  daniel to james

        //person1.planet = "Mars";//planet is static you can call tru the object but its not the right way to do

       Person.planet ="Mars";// you should call from the class name

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();//you can call static method from class, and you change it to mars now it will print mars in this class

        person1.eat("Baklava");//muhammet is eating baklava cikar

        person2.drink("water");//abdullah is drinking water

        person6.drink("Coffee");//lucy is drinking coffee


    }
}
