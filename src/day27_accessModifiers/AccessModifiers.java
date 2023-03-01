package day27_accessModifiers;

public class AccessModifiers {

    public  static int publicData = 200;
    // in the main method we can access this
    protected static int protectedData =300;
    static int defaultData= 400;// bu default keyword yok kendiliginden yaziyo basa default diyie dusun


    public static void main(String[] args) {

        System.out.println(publicData);// accesss yapabildi static oldugu icin direk isimle yapabildik




    }


}
