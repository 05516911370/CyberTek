package assignments4;

import java.util.*;

public class arraysMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums ={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
        int maxnum=nums[0];

        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]>maxnum){
                maxnum=nums[i];
            }
        }
        System.out.println("nums--> "+Arrays.toString(nums)+"-->"+maxnum);












    }
}
