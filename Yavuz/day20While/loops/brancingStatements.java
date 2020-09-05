package day20While.loops;

import java.util.Scanner;

public class brancingStatements {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);

        char ch = 'A';
        while (ch<='E'){
            ch++;
            //System.out.println(ch);
            if (ch=='C'){
                ch++;
                continue;//skips everything even the iterator(ch++)
            }
            System.out.println(ch);
           // ch++;
        }

















    }
}
