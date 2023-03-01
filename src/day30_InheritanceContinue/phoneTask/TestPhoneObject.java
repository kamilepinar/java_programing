package day30_InheritanceContinue.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("I Phone 12", "large", " Black", 1000.5);

        Samsung samsung = new Samsung("Galaxy s22", "Medium","white",1100);

        Nokia nokia =new Nokia("Brick", "Small", "Pink", 50);



        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        System.out.println("-------------------------------");

        iphone.faceTime(123456789);
        // samsung.faceTime(123456789);
        // nokia.faceTime(123456789);

        samsung.freeze();
        // iphone.freeze();
        //  nokia.freeze();

        nokia.selfDefense();
        //   iphone.selfDefense();
        //   samsung.selfDefense();

        System.out.println("-------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }



    }

