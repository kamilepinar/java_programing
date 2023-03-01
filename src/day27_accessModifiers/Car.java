package day27_accessModifiers;

public class Car { //outer class

    public String make, model, color;
    public int year;
    public double price;

    public static  int wheels =4;

    public class CarEngine{ // bu class ici class oldu inner class
        public void  method(){// bu inner class instance object of outer class oldu
            System.out.println(make);
            System.out.println(wheels);
        }

    }

    public static class StaticInnerClass{//static only accept static member not instance members
        public void method(){
            //System.out.println(make); bu instane static altinda olmaz
            System.out.println(wheels);//bu static olur
        }


    }



}
 // inner class can acces every object of outher class