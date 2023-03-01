package day32_finalKeyWord.methodOverridingPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println(getMake()+ " "+ getModel()+ " is in self-driving mode");
    }


    @Override
    public void start() {
        System.out.println("Say \"start\" to start "+ getMake()+ " "+ getModel());
    }

    @Override
    public void setModel(String model) {

        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", "Model 3"));

        if(!models.contains(model)){ // if specified model is not valid model
            System.err.println("Invalid Tesla Model: "+model);
            System.exit(1);
        }
        // String[] models = { "Model S", " Model Y", "Model x", "Model 3"};// bu da oluyordu ama arraylist daha iyi
        /* if(!Arrays.asList(models).contains(model)){//if specified model is not valid model
          System.err.println("Invalid Tesla Model: "+model);
          System.exit(1);*/
      super.setModel(model); // this .model =model;
    }


    @Override
    public void setColor(String color) {

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if(!colors.contains(color)){
            System.err.println("Invalid Tesla Color: "+color);
            System.exit(1);
        }

        //String [] colors ={ "White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}

        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if(year < 2008){
            System.err.println("invalid year of Tesla car: "+ year);
            System.exit(1);
        }
        super.setYear(year);
    }


    @Override
    public void setPrice(double price) {

        if(price < 50000){
            System.err.println("Invalid price for Tesla: " + price);
            System.exit(1);
        }
        super.setPrice(price);
    }
}
/*
 5. Tesla
               		start(): "Say \"Start\""
	                Extra method:
	                	  autoPilot()
	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */