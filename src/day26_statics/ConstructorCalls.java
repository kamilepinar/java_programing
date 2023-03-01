package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public  ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls(String c){
        this(2.5);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();

        System.out.println("----------------------------");

        method2();


    }
    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

}
 //   * regular method you can call by using the method name . method 1 i method 2 da cagirdik
 // but we can not call constructer by its name in another constructer.
// there is rules for constructor calls: you can not call by its name
// special key word you need to use. this() key word you need to use
// this.  or this()
// this. : to call instance variable and instance methods
//  *   this() : used for calling constructors in another constructor
//  *only a constrctor can call another constructor other method can not call constructor
//  *this() always need to be first step, regulor method da istersen ikinci siraya koy olur ama constructor da ilk olmak zorunda
//what if you want to call multiple cunstructor
//  *one constructor can not call more than one constructor
//  *constrctor can not call itself


