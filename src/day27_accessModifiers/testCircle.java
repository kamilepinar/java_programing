package day27_accessModifiers;

public class testCircle {
    public static void main(String[] args) {


        Circle circle1 = new Circle(3.5);
        Circle circle2 =new Circle(5);
        Circle circle3 = new Circle(7);


        System.out.println(circle1);// Circle{radius=3.5, diameter=7.0, PI=3.14, area=38.465, perimeter=21.98}
        System.out.println(circle2); // Circle{radius=5.0, diameter=10.0, PI=3.14, area=78.5, perimeter=31.400000000000002}
        System.out.println(circle3);

        System.out.println(circle1.pi);// you can call static variable, object chare the class member, but you should call with abject
 //     hepsiyle cagirabilirsin pi ama hepsiyle tekrar tekrar cagirma boyle

        System.out.println(Circle.pi);// boyle class dan cagircaksin not from the object
        //System.out.println(Circle.radious); class can not acces object members




    }
}
