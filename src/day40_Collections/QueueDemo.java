package day40_Collections;

import java.util.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class
QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); //order is random , doesn't accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));//order random this is disadvantage
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //   queue1.addAll(Arrays.asList(null, null, null));

        System.out.println(queue1);

        int num1 = queue1.poll(); // ===> FIFO

        System.out.println(queue1);//it will remove the first element

        queue1.poll();
        queue1.poll();
        queue1.poll();//first three element remove oldu simdi

        System.out.println(queue1);

        //  System.out.println(queue1.get(4));

        System.out.println("------------------------------------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order, does not accept null,dublication is ok
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));//which ever you add first it will be first element soo it keep insertion order
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // queue2.addAll(Arrays.asList(null, null, null));

        System.out.println(queue2);


        queue2.poll();//hepsini cikarinca [] bos kutu cikiyor boyle



        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

        //  System.out.println(queue2.get(3));

        System.out.println("---------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // insertion order, accepts null, has index
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null));

        System.out.println(queue3);

        queue3.poll();//linked list has pool method too because its implement queue

        System.out.println(queue3);


        System.out.println(  ( (LinkedList)queue3).get(4)  );//downcasting to linked list


        System.out.println("---------------------------------------------");

        List<Integer> list = new LinkedList<>();

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));

        System.out.println(list);

        ( (LinkedList)list).poll();  // FIFO// reference does not have poll method so you have to do downcasting because linked list has poll method

        System.out.println(list);


        // ( (Stack)list ).pop();   // LIFO only unique for stack

        System.out.println(list);

//poll method has only in priorityqueue, arraydeque and linked list


    }
}
