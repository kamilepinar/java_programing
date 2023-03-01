package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {//disardaki classlardan ulasilsin diye public super class da bu protective di
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    public void autoPark(){// public ulasilsin bu methoda
        System.out.println(getMake() +" "+getModel() +" has auto park feature");
    }

}
