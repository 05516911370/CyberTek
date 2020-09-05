package Strings;

import java.util.Scanner;

public class endswith {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);

        System.out.println("Enter your word: ");

        String a = zuko.next();

        if (a.endsWith("ly")){

            System.out.println("REALLY!!");
        }else{
            System.out.println("never mind.");
        }


        System.out.println("============================");

        System.out.println("Enter first word");

        String word1 = zuko.next();

        System.out.println("Enter your second word");
        String word2 = zuko.next();


       boolean result = word1.length()==5&&word2.length()==5;

       if (result){
           char ch1 = word1.charAt(word1.length()-1);//last charracter of the first word
           char ch2 = word2.charAt(0);//first character of the second word
            if (ch1==ch2){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }



       }else{
           System.out.println("need to be exactly 5 chars length");
       }





    }
}
