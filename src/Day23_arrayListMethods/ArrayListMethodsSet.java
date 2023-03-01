package Day23_arrayListMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsSet {
    public static void main(String[] args) {

        int[] array ={1,2,3,4,5,};
        // in order to update the elememt you need to asiign it to new value

        array[0]= 100;// this is how you update the value
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------------------------------------------");
        // Array list te method kullanman gerek
        ArrayList<String> groceriesList =new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("cooking oil");

        System.out.println(groceriesList);

        // if you need to update on arraylist you have to call the method set! set(index, "string")
        groceriesList.set(2,"Oranges");
        System.out.println(groceriesList);


        System.out.println("________________________________________________________________");

        groceriesList.remove(0);//simdi eggs yok
        System.out.println(groceriesList);

        // another way is giving the object name. and remove method only remove 1

        groceriesList.remove("paper towels");

        System.out.println("-----------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);// add all method ogrenince tek seferde yapabilcen bunlar value index 0
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //to remove element.  if you go with index but for passing object it will be taking as int so it will see as index number, gives error
        //in order to pass primitive as a an intere object you need to passs wrapper class, you need to use value of methods
        numbers.remove(Integer.valueOf(20));// auto boxing yapti simdi bu object te cevirdi(wraper class object oldu.


        System.out.println(numbers);

        // remove method boolean experession onu eger boolean r1 = number.remove(Integer.valueOf(20) assign yaparsan true sonucu verir bize

        System.out.println("-------------------------------------------------------------------------------------");

        numbers.clear();// smdi hepsini sildi supurdu simdi size 0 oldu
        System.out.println("--------------------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyye");
        names.add("Sumeyye");
        names.add("ALi");
        names.add("Sumeyye");

        System.out.println(names.indexOf("Vasyl"));// index 0
        System.out.println(names.lastIndexOf("Vasyl")); // index 1

        System.out.println(names.lastIndexOf("Sumeyye")); //index 5

        System.out.println("---------------------------------------------------------------------------------------------------------");

        boolean hasMuhtar =names.contains ("Muhtar"); // false
        boolean hasAli = names.contains("Ali");
        boolean hasmarika = names.contains("marika");

        System.out.println("has Muhtar" + hasMuhtar + "has ali " + hasAli + "has marika kucuk harfle "+hasmarika);

        System.out.println("_----------------------------------------------------");


        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 = list1; // burda assign yaptigin icin iki obje ayni  == true cikar

        list1.add(10);// bu otomatick list2 yada 10 degerini koyuyor yukarda assign oldugu icin

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);//true


        ArrayList<Integer> l1 = new ArrayList<>();// bunlarin ikisi farkli object, different allocation in heap
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);// even they have same element they are not equal
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);// they are not equal o yuzden false cikar

        System.out.println(l1.equals(l2));// bu elementlerin degeri ayni mi onu cek yaoiyo


        System.out.println("-------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));//false


        System.out.println(n1.isEmpty());//false
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());//simdi clearden sonra true
        System.out.println(n2.isEmpty());






    }





}
