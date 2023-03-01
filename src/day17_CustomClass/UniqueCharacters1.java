package day17_CustomClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){//index bize nosunu veriyor eger karakterinin ilk ve son indexi ayni ise bir keredir
                unique += each;
            }


        }


                   System.out.println(unique);



    }


}

/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd
 */





