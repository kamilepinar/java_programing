package day41_maps;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(); // list of  array list
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(70, 80, 90, 100, 110));

        // we can create array of list and  contains all there arraylist object


        List<Integer>[] arrayOfLists = new List[3];//{ list1, list2, list3}//array support collection, collection suport arrays
      // array support primitve and non primitive , this is list of array now

        arrayOfLists[0] = list1;// disda kalan array o yuzden square bracet koyucan
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;


        System.out.println(Arrays.toString(arrayOfLists));

        arrayOfLists[0].set(4, 50);

        System.out.println(Arrays.toString(arrayOfLists));


        Set<Integer>[] arrayOfSets = new Set[5];
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        System.out.println(Arrays.toString(arrayOfSets));

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));

        System.out.println(Arrays.toString(arrayOfSets));






    }
}
