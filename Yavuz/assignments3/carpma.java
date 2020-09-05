package assignments3;

import java.util.Scanner;

public class carpma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 1;
        for (int a=1;a<=n;a+=1) {

             sum*=a;

        }
        System.out.println(sum);









    }
}