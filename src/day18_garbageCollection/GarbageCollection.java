package day18_garbageCollection;

import day17_CustomClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {


        String s1 ="Java";
        s1=null;//means no object created, this object is unreferance, eligible for garbage collection
        System.out.println(s1);
        // garbage collection icin fastest way assigned to null, null does not have memory
         //  System.out.println(s1.toUpperCase()); object not exit neyi yapiyosun error verir boyle

        //  System.out.println( s1.replace(null, "Python"));// variable yada method yada bisey yapamazsin yok cnki

        String a = "";// its in heap memory
        String b = null;// this does not exist

        System.out.println("-------------------------------------------");

        String str1 = "Python";//after you assigned it python will be eligible for garbage collection
        str1 = "CYDEO";

        System.out.println(str1);


        System.out.println("-------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("chuck","bulldog",'M',5,"Small","white");

     //  dog1 =null;// simdi null oldu yada assign yapican

        dog1= dog2;
        System.out.println(dog1);
        System.out.println(dog2);// ikiside dog 2 yu gosteriyor loki gitti. elligible for garbage collection
      // new Dog().finalize(); sen yapmiyosun garbage collector yapiyor sen bil sadece

    }

}
