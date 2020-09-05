package assignments4;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String k =scan.next();
        int a=k.length();
        int count = 0;

        for (int i=0;i<=word.length()-a;i++){

            if (word.substring(i,i+a).equalsIgnoreCase(k)){
                count++;
            }
        }
        System.out.println(count);








    }
}
