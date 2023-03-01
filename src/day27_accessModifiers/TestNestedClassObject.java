package day27_accessModifiers;

public class TestNestedClassObject {
    public static void main(String[] args) {



        Car obj1 =new Car(); // car object once bunu create yapman lazim ki alttaki clasa ulasabilesin

       // obj1.new CarEngine();//car engine object BU KISA YOL ASSAGIDA KI ASSIGN

        //and inner class could be static  burda not static ama static olan bi class assigda

        new Car.StaticInnerClass();// bu static class direk cagirabiliyoruz


        Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object INSTANCE CLASS

        Car.StaticInnerClass obj3 =  new Car.StaticInnerClass();//BU STATIC CLASS






    }
}
 //IN JAVA ONLY INNER CLASS CAN BE STATIC MAIN METHOD DA BIR INNER CLASS O OLUR