package day37_exceptions;

import day31_Inheritance.shape_methodOverriding.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);

        Pizza pizza2 = new Pizza('S',2,3);
        System.out.println(pizza1 == pizza2);//false different memmory diffrent place

        System.out.println(pizza1.equals(pizza2));//true // parameter is object o yuzden hersey kabul eder make sure you pass pizza object yoksa cast expection


        Object obj = new Pizza('S', 4, 3); //upcasting (object) new Pizza gorunmuyor
      //in poly object type ddetermin which implementation will executed if method overriding
        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total =  ( (Pizza)obj).calcCost();

        System.out.println(total);

       // double area = ( (Circle)obj ).area();//its gives cast expection because no relation between

        //   System.out.println(area);

        System.out.println("Test Completed");




    }




}
