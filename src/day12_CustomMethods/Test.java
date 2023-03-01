package day12_CustomMethods;

public class Test {

    public static void main(String[] args) {


        int number =300;

        CustomMethodWithParameter.oddOrEven(300);// bu classin adini cagir nokta koy methodunun adini yaz
        // o zaman ordaki methodu kullanabiliyorsun. bunun sonucu 300 is even number diye cik


        // .initial(firstName, lastName) cagirmak icin once klasini bul sonra methodunu yaz
        CustomMethodsPractice.initial("Kamile","Okatar");



        String str ="Dog Cat";
        str.replace("Cat", " Dog");
        System.out.println(str.endsWith("Dog"));
        System.out.println(str.startsWith("Dog"));


    }





}
