package assignments3;

import java.util.Scanner;

public class sayiToplama {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int n = s.nextInt();


        for (int number =1; number<=n;number++){
            sum= sum+number;
        }
        System.out.println(sum);












    }
}
