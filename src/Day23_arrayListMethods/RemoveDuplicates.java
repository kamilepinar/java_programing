package Day23_arrayListMethods;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyye");
        names.add("Sumeyye");
        names.add("ALi");
        names.add("Sumeyye");


        ArrayList<String> nonDup = new ArrayList<>(); // burda add every single element to new array but not the dublicates

        for (String each : names) {
            if(nonDup.contains(each)){
                continue;// if it contains this elemet skip
            }
            nonDup.add(each);

        }
        //to make a referense  the left objects we asign it to new arraylist and it will be eligible for garbage collection
        names = nonDup;



        System.out.println(nonDup);// bu  vasyl, sumeyye, ali cikarir




    }
}
