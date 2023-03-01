package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {


        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("Name", "Arthur");
        person1.put("Gender",'M');
        person1.put("Age",32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println(person1);

        System.out.println( person1.get("name") );//keys are unique in the made so you use get method to get keys value
        System.out.println( person1.get("salary"));//give key on get method, it gives the value in the console
        System.out.println( person1.get("job_title"));
        // you can not give index number u need to give keys t will give you null value










    }
}
