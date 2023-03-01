package day11_StringContinue;

public class StringMethod2 {
    public static void main(String[] args) {


        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");// "","" yazicaksin sadece

        System.out.println(sentence);

        //----------------------------------------------------------

        String word = "java";

        // word = word.replace('a' , 'e');  //"jeve"

        word.replace("a", "e");

        System.out.println(word);

        //----------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        //----------------------------------------------------------

        String sentence3 = "Java is fun, Java  is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        //when you want to change the second java word with pyton u make it uniqu and give the cama and space before it, and there is 2 matching ne like this but
        // program read left to right and takes it as the first matching one

        System.out.println(sentence3);


        //----------------------------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10+1);// yada direk 11 ver
      //in substring  you wantto print java mesela you need to give index number but if you guve the 7,10 the last index number yani
        //10 will be xlude o zaman jav cikar o yuzden 10+1 yapiyorsun
        System.out.println(languageName);

        //----------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789

        String today = sentence5.substring(9, 15);

        System.out.println(today);

        //----------------------------------------

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf("@") + 1;//@ den sonra olani bulmak icin arti bir verdik
        int ending = email.lastIndexOf('.');//it because exclude the ending first charakter yani dot olmicak


        String domain =  email.substring(beginning, ending);

        System.out.println(domain);

        //----------------------------------------
      // parca almak istersen basina sonuna veriyorsun ama bi yerden sonuna kadarsa ikinciyi vermene geerek yok
        //ama bi yerden baslayip sonuna kadar istersen ilkini yazman yeterli ornek assagida
        String sentence6 = "I love Java programming";

        // String r1 = sentence6.substring(7, sentence6.length());

        String r1 = sentence6.substring(7);

        System.out.println(r1);


        System.out.println("------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow =  sentence7.substring( sentence7.lastIndexOf(" ") + 1 );
        // create the substring "Monday" from sentence7. DO NOT count any index numbers
        //mondayi istedigi icin spaceden sonra ki icin arti 1 yapti

        System.out.println(tomorrow);

        System.out.println("------------------------------------");

        String str = "Python";

        String result = (str +"\n").repeat(10);

        System.out.println(result);





    }
}
