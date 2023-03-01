package day27_accessModifiers;

public class InstanceBlock {

    {
        System.out.println("instance block");// direk {} icine yazdiigin consturcterdan once execute olur
        //bu instance initilization block
    }

    public InstanceBlock(){
        System.out.println("Constructer");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
        //instance once sonra constructer, second objectte te ayni once instance block sonra constructer
        /* instance block
       Constructer
       instance block
      Constructer
       instance block
      Constructer*/





    }
}
