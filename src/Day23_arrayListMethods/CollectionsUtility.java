package Day23_arrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max: " +max);
        System.out.println("min: "+ min);
        System.out.println("--------------------------------------------------------------------------");

        ArrayList<String> items =new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));


        Collections.sort(items);

        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );

        System.out.println(students);

        Collections.swap(students, 0 , 1);

        System.out.println(students);

        Collections.swap(students, 0, students.size()-1);//burda length degil size var

        System.out.println(students);



    }
}
 /* collection are static so you can call them from different class.
 *  these method only for collections, first argument given has to be collections.
 * colelction methods: max min swap reverse replaceall frequency
 *
 * array list is a collection we doesnt matter what type of collection we can use these methods
 * we just need to import from java util
 * which ever method you want you can call after calling collections class. collection.max collection min gibi
 * what ever the type is method will return that
 * sort method is only for arrays*/