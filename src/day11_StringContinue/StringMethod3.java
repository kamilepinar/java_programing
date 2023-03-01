package day11_StringContinue;

public class StringMethod3 {

    public static void main(String[] args) {



        //burdakiler boolean ile kullanilanlar  yani true false

        String word = "";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        // -------------------------

        String str = "        ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();// bu special

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //------------------------------------

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);// bu false cevabu verir cubnku bunlar iuki farkli object biri pool da biri disinda

        System.out.println( str1.equals(str2) );// ama bu objecte degil gorunuste ayni mi diye bakiyor ve bu case sensitive

        String str3 = new String("cydeo");

        System.out.println( str2.equals(str3));//case sensitive diye false verir

        //------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        //------------------------------------
        // yes , Yes, yES, YeS  ===> yes

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);


        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");
        //   boolean hasJava = sentence.equalsIgnoreCase("java");

        System.out.println("hasJava = " + hasJava);

        //----------------------------------------------------------

        String name = "Micheal";

        boolean l =  name.startsWith("Da");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);


        boolean t = url.endsWith(".com");

        System.out.println(t);

        //------------------------------------------------

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);








    }
}
