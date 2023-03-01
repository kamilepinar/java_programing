package day30_InheritanceContinue.phoneTask;

public class Iphone extends Phone {//Iphone is a Phone

    public Iphone(String model, String size, String color, double price) {
 // bu iphone un kendi constructeri phone clssindan clonladik bunu
        super("Apple",model,size,color,price);
    }

    public static boolean hasApplePay = true;

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }






}
