package day18;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        char ch1 = str.charAt(0);

        String st1=str.substring(1);//"ava";
        String st2 = str.substring(0,1);//"J";

        String result = st1+st2;//"avaJ";
        System.out.println(result);



























    }
}
