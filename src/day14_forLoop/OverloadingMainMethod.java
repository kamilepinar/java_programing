package day14_forLoop;

public class OverloadingMainMethod {
    public static void main(String[] args) {//this main method came from system library the other you created
     // you are not spose tyo overload main method there is no point
        //kare olan parantezi kaldirirsan o zaman digerlerini de cikariyor get executed oluyor
        //yoksa normalde sadece a cikiyor , kara parantezi sonra ogrenicez
        System.out.println("A");
        main(25); // B
        main(2.05); //C
        main(true); //D

    }


    public static void main(int args){

        System.out.println("B");

    }

    public static void main(double args){

        System.out.println("C");

    }

    public static void main(boolean args){

        System.out.println("D");

    }





}
