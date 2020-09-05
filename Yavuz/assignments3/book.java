package assignments3;

import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you premium?");
        boolean premiumCus = scan.nextBoolean();
        System.out.println("How many books will you buy?");
        int bookpurchased = scan.nextInt();
        int freebook= 0;

        if (premiumCus) {
            freebook = bookpurchased / 8*2;
            int freebook1 = bookpurchased % 8 / 5;
            System.out.println("free books: "+(freebook+freebook1));
        }else if (!premiumCus){
            freebook=bookpurchased/12*2;
            int freebook1=bookpurchased%12/7;
            System.out.println("free books: "+(freebook1+freebook));
        }














    }
}
