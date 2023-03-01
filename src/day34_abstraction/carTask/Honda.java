package day34_abstraction.carTask;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price); //only constructer can call other constracter
    }

    @Override
    public void start(){ // we are overiding this abstract method
        System.out.println("Twist the key to ignition to start " + getMake()+" "+getModel());
    }


}
