package assignments4;

import java.util.Scanner;

public class Arrays_count_of_even {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] nums = new int[10];
        int count=0;
        for (int i =0;i<=9;i++){
            nums[i] = input.nextInt();
        }

        for (int each:nums){
            if (each%2==0){
            count++;

            }
        }
        System.out.println(count);

    }
}
