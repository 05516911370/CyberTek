package assignments3;

import java.util.Scanner;

public class basit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String word = scan.next();

        char a = word.charAt(0);
        int b = word.length()-1;
        char c = word.charAt(b);

        System.out.println(""+a+c+"");







    }
}
