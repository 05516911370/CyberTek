package day10;

import java.util.IllegalFormatCodePointException;

public class sktable {

    public static void main(String[] args) {
        //upper case between 65-90
        // lower case between 97-122
        // 48 <= character <= 57
        char character = 'A';

        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character < 122);
        //upper case letters       ||       lower case letters


        if (isAlphabetic) {
            System.out.println(character + " is Alphabetic");


        } else {
            System.out.println(character + " is not Alphabetic");


        }

        String digit = "";
        boolean isDigit = character >= 47 && character<= 57;
        if (isDigit){
            digit = character + " is a digit";

        }else {
            digit = character + " is not a digit";
        }

        System.out.println(digit);



        boolean speacialCharacter = !isAlphabetic && !isDigit;
        String notSpeacil = "";

        if(speacialCharacter){
            notSpeacil = character + " is speacia character";

        }else{ notSpeacil = character + " is not a speacil character";}
        System.out.println(notSpeacil);

    }
}
