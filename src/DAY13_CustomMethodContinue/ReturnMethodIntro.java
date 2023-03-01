package DAY13_CustomMethodContinue;

import java.sql.SQLOutput;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total= sum(20,40);// if you create void method, you can not call it for returning value.


        int total =addition(20,40);// bu return method cagirma, istedigin heryere cagirbilirsin

        System.out.println(total);// buda print yapma icin

        int t =square(10);
        System.out.println(square(10));// System.out.println(t);

        int r=cube(5);

    }

    //public static void sum(int n1,int n2){
      //  int result=n1 +n2;

    public static int addition(int n1, int n2){
        int result = n1 +n2;
        return result;
    }
    public static void addition2(int n1, int n2){
        int result =n1 +n2;
        System.out.println(result);
    }


    public static int square(int num){
        int square = num*num;
        return square;
    }
    public static int cube(int num){
        int cube =num*num*num;// yada int cube=square(num)*num; yukardakini cagirdin burda kullandin simdi
        return cube;
    }// hangi method once oldugu oneli degil once cube sonra square da versen yine bu ikinci optiona yapabilirsin

}
