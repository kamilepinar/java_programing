package day11_StringContinue;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

            // System.out.println("".charAt(0));//bundan eror verir

            String str = new Scanner(System.in).nextLine();//yazilan ne ise onu cikaricak sadece bi kere yazsan yeter

            if(str.length() >= 1){ // if the string has at least one character.bu direk sayilari

                char f = str.charAt(0); //the first character of string-0 is index number01234 diye baslayan

                if(f >= '0' && f <= '9'){
                    System.out.println("first character is digit");
                }else if( f >= 'A' && f <= 'Z'){
                    System.out.println("first character is uppercase letter");
                }else if( f >= 'a' && f <= 'z'){
                    System.out.println("first character is lowercase letter");
                }else{
                    System.out.println("first character is special character");
                }


            }else{ // if string is empty
                System.out.println("String is empty");
            }



        }


    }


/*
3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"
        	HINT: You need to check the ascii table
 */



