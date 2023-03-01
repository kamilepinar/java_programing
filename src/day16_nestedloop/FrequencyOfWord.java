package day16_nestedloop;

public class FrequencyOfWord {
    public static void main(String[] args) {


      /*  String sentence = "Java Java Java Java";
        String word = "java";

        int count =0;

        while(sentence.contains(word));        // as long as this condition true,i can count it.
        count ++;                             // count should be increase by one
                                             // you need to remove(java) one at a time soo loopp can not run to sonsuz
        sentence.replaceFirst("java","");   // we are going to replace the word with empty string so loop will stop when ever
                                           // loop has not that word(burda java)*/

        String sentence = "java JAVA jAvA JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, ""); //
        }


        System.out.println(count);




    }
}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"
		    output:
		        4
        "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
 */