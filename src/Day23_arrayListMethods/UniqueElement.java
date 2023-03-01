package Day23_arrayListMethods;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyye");
        names.add("Sumeyye");
        names.add("ALi");
        names.add("Sumeyye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");


        for (String each : names){
            if(names.indexOf(each) == names.lastIndexOf(each)){// ilk gorundugu yer ile son goruldugu yer ayni ise unique olur
                System.out.println(each);
                break; // after find the first unique element it will exit the loop
            }
        }








    }
}
