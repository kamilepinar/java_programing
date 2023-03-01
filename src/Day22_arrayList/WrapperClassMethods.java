package Day22_arrayList;

public class WrapperClassMethods {


    public static void main(String[] args) {


        String str = "20";
        System.out.println(str +1);// 201 cikar
        // if you need to convert to string to primitve int you use parse method


       // Integer.parseInt(str);// thi is give you int primitive so yu can assign to int

        int num1 = Integer.parseInt(str); // this will return you primitive int and assign to int primitive so its not unboxing or autoboxing

        System.out.println(num1 +1);// bu simdi bize 21 vercek

        // array supprt primitive and non primitive
        // map and collection only support non-primitive,

        // if you need to convert to string to integer wrapper class
        Integer num2 = Integer.valueOf(str); // assgin to int wrapper class. wrapper to wraper class. buda ne auto ne unboxing


        System.out.println(num2);


        System.out.println("---------------------------------------------------------");

        String s = "20.5";//convert string to double
        double num3 = Double.parseDouble(s);//you will get primitive value, make sure you ASSIGN
        Double num4 = Double.valueOf(s);// STRING TO CONVERT TO NUMBER AND USE IN OTHER DATA STRUCTURE


        System.out.println(num3);
        System.out.println(num4);
        System.out.println("--------------------------------------------------------");

        String x = "true";
        boolean r1= Boolean.parseBoolean(x);//parse method is case sensitive. it has to be lower case,return
        Boolean r2 = Boolean.valueOf(x);//this is wrapper clas booolen so you can use different data structures too

        System.out.println(r1);

        System.out.println(r2);

 //  parse method will return primitive value, but value of method will return wrapper class object,converts string to wraper clas value


        System.out.println("-------------------------------------");


        char ch = '1'; // if the charakter is digit
        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit);//it will return true




        // if this charkter is letter

        char ch1 ='A';
        boolean isLetter =Character.isLetter(ch1);
        System.out.println(isLetter);//true

        boolean isLowerCase = Character.isLowerCase(ch1);
        System.out.println(isLowerCase);//false

        // is lower or upper method is for boolean
        boolean isupperCase =Character.isUpperCase(ch1);//true





        Character.isLetterOrDigit(ch1); // eger letter yada digit ise true verir ! not letter not digit dersen karakter verir

        boolean isSpecialChar = !Character.isLetterOrDigit(ch1);// false cikar $ isareti falan olsaydi

        System.out.println("================================================");

        String string ="a1b2c3d4e5";
        int sum =0;


        //once char value olarak alip sonra her charakteri digit mi diye bakiyosun
       for (char each : string.toCharArray()){
           if(Character.isDigit(each)){
             sum += Integer.parseInt(""+each);//convert to char a number// parse method only accept string o yuzdenconcate""
           }
       }

        System.out.println(sum);














    }





}
