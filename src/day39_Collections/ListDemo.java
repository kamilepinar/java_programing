package day39_Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer>arrayList = new ArrayList<>();//array base class, get() is faster

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.get(0);//get method is in the list so we could call
        arrayList.remove(0);

        List<Integer>linkedList = new LinkedList<>();// node base class(has pointer) doubly linked list
        //linkedList.get(0);
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

       // linkedList.remove(0);

        System.out.println("------------------------------------------------------------");


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);


        System.out.println("------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);






    }
}
