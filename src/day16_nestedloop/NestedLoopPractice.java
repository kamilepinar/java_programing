package day16_nestedloop;

public class NestedLoopPractice {
    public static void main(String[] args) {


        String str = "aaabbccccddeeeeff";
        String result = "";// iki tane yazan karakterleri bulman gerek bdf
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (count == 2 && !result.contains("" + ch)) {
                result += ch;
            }

        }


        System.out.println(result);


    }

}



       /* bu assagidaki yol bir karakteri bulmak icin

        char ch =str.charAt(0); // bu ilk karakteri bulman icin
        // kac defa yazilmis bu first karakter bulmak icin
        int count =0;
        // for loop kullanmak gerek index number bulmak gerek sondaki indexi bulmak icin lenght -1 yapiyoruz
        for(int i =0; i <str.length(); i++){// < isareti verdigin icin -1 yapmana gerek yok bir eksigini veriyo zaten

        //this is how you can find each character

        if(str.charAt(i) == ch){
            count++;// this is increasing index number by one to go next letter
        }
        }
        if(count == 2 && !result.contains(""+ch)){
            result += ch;
        }
        System.out.println(result);*/


