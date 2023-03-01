package day28_OOPEnCapsulation.personTask;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;


    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;


    public Person(String name) { //allows us to create Person Object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) {//allows us to crate object by setting name and age
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) { //ister name age olani ister  name gender olani sec ama ikisi olmaz
        this(name,age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
        this(name, age, gender);
        this.language = language;
    }

    static {
        planet = " Earth";
        isHuman = true;
        hasNose =true;
        numberOfWings = 0;
        numberOfHead = 0;
    }


    public static void printPlanetName(){//no creating object its statics less memory it is static!
        System.out.println("planet name is: " + planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() { //planet static ama bu method instance o yuzden planeti koyabiliyoruz, you can change it as you wish,what ever you want to print
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize name
			Add a constructor to initialize name and age
			Add a constructor to initialize name and language
			Add a constructor to initialize name and gender
			Add a constructor to initialize name, age and gender
			Add a constructor to initialize name, age, gender, language
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */