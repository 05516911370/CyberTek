package day30;

import java.util.Arrays;

public class returnMethods3 {
    public static void main(String[] args) {
        int[] arr={100,200,50,40,60};

        int a=max(arr);
        System.out.println(a);


    }

    public static int max(int []arr){
        Arrays.sort(arr);
        int max =arr[arr.length-1];
            return max;

    }


    public static void max2(int []arr){
        Arrays.sort(arr);
        int max =arr[arr.length-1];

    }
}