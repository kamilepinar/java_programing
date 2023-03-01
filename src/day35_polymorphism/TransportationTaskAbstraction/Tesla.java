package day35_polymorphism.TransportationTaskAbstraction;

public class Tesla extends Car implements Electric, AutoPilot {

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
} //we are going to create object from them so we have to do it non abstract
