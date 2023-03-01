package day15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str ="aaaabbbbccccc";
        String result ="";//" this sting should contain "abc" final result. Its a temporary string
        for (int i = 0; i < str.length(); i++) { // this lenght to find last index number because its smaller than the lenght so-1 olucak//
            //I: index numbers of string
           // System.out.println(str.charAt(i));//i is represent index number of this string so it will give all character

            char each =str.charAt(i);//each character of string str
            if(!result.contains(""+each)){//if the string result doesnt contain the character of str yet
                result += each;// then we will add the character to string result
                // string you can not change soo concentanation ile you add eash entery
            }
        }

        // to find the matching character you


    }
}
/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */