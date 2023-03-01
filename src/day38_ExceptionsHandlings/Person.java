package day38_ExceptionsHandlings;

public class Person {

    private  String name;
    private  int age;
    private final char gender;//final oldugu icin setter yok inside constructer condition veriyoruz

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender == 'M' || gender == 'F')){//if gender is invalid
            throw new RuntimeException("Invalid Gender" + gender);//thorws runtime exceptions/crash the program
        }

        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){//if the age is invalid it will create excpection during the run time and crash your program
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
