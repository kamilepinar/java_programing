package day17_CustomClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";  //a2b1c3d1
        // a b c d
        //  2 1 3 1


        for (int j = 0; j < str.length(); j++) {// bu assagidaki bir karakteri veriyo
            // bu loop koyunca char at j ile degisitiyorsun ve her index karakteri yazmana gerek kalmiyor
            char ch = str.charAt(j); //a -first you need to find the first character
            int count = 0;
            for (int i = 0; i < str.length(); i++) {// how many time first character has apppear
                if(str.charAt(i) == ch){
                    count++;// everytime it appear count will go up
                }
            }
             // when you concate the empty string it will give you string at the end
            if(result.contains(""+ch)){ // if the character is already included in the result//
                continue; // skip that character uoksa a2a2b1c3c3c3 cikiyor
            }
            result +=  ch + "" + count;

        }

        System.out.println(result);


    }
}
/*
	2. Write a program that can find the frequency of the characters from a string
                Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */