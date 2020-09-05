package assignments4;

import java.util.Scanner;

public class arrays_findSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ana = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};

        int sum =0;

        for (int each:ana){
            sum=sum+each;
        }
        System.out.println(sum);































    }
}
