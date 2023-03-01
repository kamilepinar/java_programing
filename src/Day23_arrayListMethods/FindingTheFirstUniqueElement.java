package Day23_arrayListMethods;

import java.util.ArrayList;

public class FindingTheFirstUniqueElement {
    public static void main(String[] args) {

        //any operation with array list you have use the methods
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        System.out.println(list);

        //we want to find the first unique element. we need to  find the frequency element first.
        // once we find the frequency the elements we can use conditions to check if element is unique

       // int element = 1;// you compare to every single element of the list. then you will get frequency and  frequency will increase by one
       //buna gerek kalmadi cunku altta element variable verdik cunku sadece bir degil digerlerini de check etmesi gerek





        for(Integer element: list){
            int frequency =0;
            for (Integer each: list){
                if(each == element){
                    frequency++;
                }
            }
            if(frequency ==1){ // unique element display under this condition
                System.out.println(element);
                break;// bu ilk unique elementi verdikten sonra loop exit yapsin 2,4,6 degilde sadece 2 ilk unique olan 2 yi cikarsin diye
            }

        }
        
        /* to acces the element for each loop and this is finding the frequency, bunu yukardaki loopun icine kopycaz ki tekrar edebilsin.
        for (Integer each: list) {
            if(each==element){ // if every element matching the each of the element frequency will be increase
               frequency++;
            }

        }*/







    }

}
