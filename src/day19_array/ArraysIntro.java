package day19_array;
import java.util.Arrays;
public class ArraysIntro {

    public static void main(String[] args) {

        int scrore1 = 85;
        int scrore2 = 75;
        int scrore3 = 78;
        int scrore4 = 88;
        int scrore5 = 95;

        System.out.println("-------------------------------------------------");
        //we know how many we need to declare 5 scores
        /*int scores;
        score=*/ // boylede yapabilirsin
        //in ise int double ise double obeject yapicaksin
        // String[] scores =new String[5];
        int[] scores = new int[5];
        scores[2]= 78;//index 2
        scores[0]=85;// in the index zero
        scores[1]= 75;// it will assigned he score for that index
        scores[3]= 88;
        scores[4]= 95;

        // you can not assigned the 5(6th eelement yani) index out of bound exception. its out of range yani alamaz
       //score[-1] = 50. ayni uda index out of bound hatasi verir . increase or decrease yapamazsin

        // size of this array is 5// min idex:0 ~ 4this is index order toplamda 5 yine
      //in order create any array you need to call to string method from utility class,
        //array utility class present in java.util. and clas name is array.
        // import.java.util.Arrays; we have to call them from that class after pkg above class

                              //min index  number for to call each variable starting from  0~9

       // scores =new int[50]; // 50 element and index is 0~49simdi bundan oncekiler garbage collection icin elligible
       // bu acikta kalsa ustekiler artik okunmuyor sadece 50 tane 0 cikiyordu . assign yapsaydik 50 score cikarirdi





        System.out.println(Arrays.toString(scores));// now you are allow to pass aray object
        //in this tostring you can print the array. this is how you print the array
        System.out.println(scores[2]); // this will give 78
       // eger every scores print yapmak istersen  loop kullanabilirsin


        System.out.println("---------------------------------------");

       /* for (int i = 0; i < 5; i++) { // this i index number for this aaray (scores)
            System.out.println(scores[i]); //acces each element it print all scores
        }*/
  // array if it has more array, you need to give legnth of the array
        for (int i = 0; i < scores.length; i++) { // burda ki length is variable. it will return total num of element
            //length  burda is an instance variable,and its unchangable
            System.out.println(scores[i]);
        }

        System.out.println("--------------------------------");

        System.out.println(scores[scores.length -1]); // this is the last index number.


    }


}
