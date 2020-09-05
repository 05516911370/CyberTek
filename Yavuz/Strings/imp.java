package Strings;

import java.util.Scanner;

public class imp {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);


        System.out.println("Enter first word");

        String word1 = zuko.next();

        System.out.println("Enter your second word");
        String word2 = zuko.next();


        boolean result = word1.length()==5&&word2.length()==5;

        if (result){
         boolean b1 = word1.endsWith(""+ word2.charAt(0));
         boolean b2 = word2.startsWith(""+ word1.charAt(word1.length()-1));
            if (b1&&b2){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else {
            System.out.println("need to be exactly 5 chars lenght");
        }












    }


}
