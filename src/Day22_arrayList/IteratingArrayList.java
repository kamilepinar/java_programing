package Day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {



        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);


        System.out.println(numbers);// 100,200,300,255,400,500
        System.out.println("---------------------------------------------------------------------------");
        //iteration
        for (int i =0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }// int each = numbers.get(i); bu sekilde assign da yapabilirsin
        //System.out.print(each+" ");bu yanyana boslukla cikmasi icin


        System.out.println("--------------------------------------------------------------------------------");

        //reverse iteration

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i)+" ");
        }

        System.out.println("_---------------------------------------------------------------");
        //for each loop you dont have access index number so when ever you want reverse or add new element for each can not help
        // but you can use if you want to acces to elemetn then for each loop is the shortest


        for(Integer each : numbers) { // int kullanmis olsaydin o zaman numbers int wrapperclass oldugu icin o unboxiung olurdu
            System.out.println(each);//
        }


    }

}
