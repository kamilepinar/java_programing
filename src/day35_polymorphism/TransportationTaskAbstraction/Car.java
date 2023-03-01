package day35_polymorphism.TransportationTaskAbstraction;

public abstract class Car extends Transportation{//it has to be abtract because its calling abstract parent and parents methods

    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " + getMake()+ getModel());
    }


}
