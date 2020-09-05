package assignments;

import java.util.Scanner;

public class c11 {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);

        System.out.println("Enter price in cents: ");

        int price = zuko.nextInt();

        int a = price/25;
        int b = price%25/10;
        int c = price%25%10/5  ;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);








































    }
}
