package assignments3;

import java.util.Scanner;

public class basit2 {
    public static void main(String[] args) {

        int a = 80;

        while (a>=20){
            System.out.print(a+ " ");
            a--;
        }

        Scanner scan = new Scanner(System.in);


        String word = scan.nextLine();

        System.out.println((""+word.charAt(0)).toUpperCase()+word.substring(1));






    }
}
