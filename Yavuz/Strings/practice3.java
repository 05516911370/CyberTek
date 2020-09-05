package Strings;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();


        int lastIndexnum = sentence.length() -1;

        System.out.println(sentence.charAt(0)+ sentence.charAt(lastIndexnum));






















    }
}
