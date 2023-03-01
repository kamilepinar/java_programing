package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {
    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Pinar", 'F', LocalDate.of(1985, 12, 20));
        people[2].setInfo("Emre", 'M', LocalDate.of(1986, 06, 19));
        people[3].setInfo("Abdullah", 'M', LocalDate.of(1949, 01, 13));
        people[4].setInfo("Fulya", 'F', LocalDate.of(1956, 11, 21));


        ArrayList<Person> List = new ArrayList<>();
        List.addAll(Arrays.asList(people));


        //how w add all the element into the arraylist, this is nonprimitive so add all method, add all method only take collection type
        // so you need to convert this array you need to use aslist method to convert it


        //print name and date of birth each person objects
        //remove all the person object who is age is >55
        //remove if

        System.out.println(Arrays.toString(people));

        System.out.println("-------------------------------------------");

        ArrayList<Person> eachPerson = new ArrayList<>();

        for (Person each : people) {
            System.out.println(each.name+" : " +each.age);

        }
        System.out.println("-----------------------------------------------------");

       /* ArrayList<Person> olderThan55 =new ArrayList<>();


        for(Person each : people){
            if(each.age > 55){
                continue;
            }
            System.out.println(each);
        }*/

        System.out.println("-----------------");

        ArrayList<Person> old =new ArrayList<>(Arrays.asList(people));

        old.removeIf(p -> p.age > 55);

        System.out.println(old);



    }
}
