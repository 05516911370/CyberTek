package day23;

import java.util.Scanner;

public class avarage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for (int i = arr.length-1;i>=0;i--){
            sum+= arr[i];
        }

        double avaregae = sum / (double)arr.length;

        System.out.println("Avegae:"+ avaregae);



















    }
}
