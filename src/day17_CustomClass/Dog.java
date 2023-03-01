package day17_CustomClass;

public class Dog {
    public String name;//instance variable// bunun altinda bir suru baska isim olabilir
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    //"Max" ,      "Husky",         'M",      4 ,       "small",      "White"
    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name;  // this keyword is used for calling the instance variable name
        this.breed =  breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    } // this method can help us to set all the information of the dog at once


//if you add stattic it wont be instance, static means only one, object will be only one but instance it will be multiple name breed gibi

    public void eat(){// each object have own eat method/ this is instance method
        System.out.println(name + " is eating");

    }

    public void drink(){
        System.out.println(name + "is drinking water");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
