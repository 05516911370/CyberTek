package day31_recap;

import java.util.Arrays;
import java.util.Scanner;

public class method_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //first one
        max(10,20);

        //second one
        int a=max1(99,88);

        int[]arr= {5,4,21,23,2,3,5,6};


    }

    public static void max(int a,int b){
        int max=0;

        if (a>b){
            max=a;
        }else{
            max=b;
        }
        //  return max;
    }

    public static int max1(int a,int b){


        int max1= a>b? a:b;
        return max1;
    }




public static int maxNum(int[] arr){
        int maxnum=0;

        Arrays.sort(arr);

        maxnum=arr[arr.length-1];
        return maxnum;


}










}
