package day21_MultiDimensinalArray;

import java.util.Arrays;

public class MultiDimesionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;


        String[][] groups = {group1, group2, group3, group4};
        //                      0        1       2       3   length is 4

        for (int i = 0; i < groups.length; i++) { //this is for 2d array
            String[] eachGroup = groups[i]; // bu lopp[ lucy,umran,sumeyye,abdullah] veriyor
            System.out.println(Arrays.toString(eachGroup));//bunu yazmazsan assigida ki loop ile sadece isimleri sirayla veriyor hepsini

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup) );
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }


        System.out.println("-----------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {// bu gruplari reverse order veriyor yani sonraki gruptan basliyor

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));// burda toplu gruplari verdigi icin mecbur tostring klullancak unutma

            for (String eachStudent : eachGroup) {//burda her grubu sirasiyla veriyor each oldugu icin ters vermiyor
                System.out.println(eachStudent);// burda her birini sordugu icin icindekilerin normal variablke cagiriyorsun
            }

        }


        System.out.println("-----------------------------------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY,boyle multi demension yazarsan hascod verir

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY










    }
}
