package day27_accessModifiers;

public class InstanceInitilizationBlock {

    public String name;
    public int age;

    // we wat to initilizate them, beside constructer we have instance initilization block
    //when ever  you initilizate the name or age it will be default value of that object

    /*{
        name  ="james";
        age = 20;
    }*/

    public InstanceInitilizationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

       // InstanceInitilizationBlock obj1 =new InstanceInitilizationBlock();//james
      //  InstanceInitilizationBlock obj2 = new InstanceInitilizationBlock(); //james

        // bu iki object de ayni isim oldu o yuzden constructer kullaninca farkli isim olabilir o yuzden constrtur daha iyi


        InstanceInitilizationBlock obj1 = new InstanceInitilizationBlock("James", 25);//simdi farkli valuelar koyabiliriz

        InstanceInitilizationBlock obj2 = new InstanceInitilizationBlock("Aaron", 28);//constructer ile


        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }







}
