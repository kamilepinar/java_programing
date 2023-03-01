package DAY13_CustomMethodContinue;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(25);
        System.out.println("------------------------------------");

        System.out.println("Test1 Started");

        boolean exit = true;
        if(exit){
            return; // main method gets terminated
            //    System.out.println("Hello");// return methodu main yani void methodun icinde yazarsan yazdigin coddan cikip teminate yapar
            // ama eger return method icinde verirsen sana value yu return yapar akilli bidik
        }

        System.out.println("Test1 Completed");

        System.out.println("Test2 started");

    }


    public static void eligible(int age){// you can use void if you dont return a value but just print statement you get

        if(age < 0 || age > 150){
            System.err.println("Invalid age: "+age);
            return; // exits the method// you just use return not giving the value next to it
            // if the age is invalid, then this method gets terminated
        }


        if(age>= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }

    }



    public static int multiplication(int n1, int n2){

        int result = n1 * n2;

        return result; // returns the value when exiting the method
        //   System.out.println("Hello"); bunu yapamaz cunku yukarda return ile valuyu verip exit yaptin devam edemez eror verir

    }





}






