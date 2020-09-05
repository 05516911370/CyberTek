package day30;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        maxNum(20,30);
        int arr[]={5,2,3,4,5,6,4,7,0,-1};
        printDesc(arr);

        int[] a1={1,2,3};
        int[] a2 ={4,5,6};
        combine2Arrays(a1,a2);

        posnegzero(-100);
        System.out.println("=======================================");
        int[] a3 = {100,-100,-200,-300,0,0,900,5000};

        for (int each: a3){
            posnegzero(each);
        }






    }


    // task01:
    public static void maxNum(int a, int b){
        if (a==b){
            System.out.print("Equal");
            return; // exits the method
        }
        if (a>b){
            System.out.print(a+" is maximum");
        }else{
            System.out.print(b+" is the maximum");
        }
        System.out.println();
    }

    // task02:
    public static void printDesc(int[]arr){// {10,9,20,30,5,6,7};
        Arrays.sort(arr);// [{5,6,7,9,10,20,30};
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    // task03;
    public static void combine2Arrays (int[] arr1, int[]arr2){
        int[] arr3 = new int [arr1.length+arr2.length];

        int i =0;
        for (int each:arr1){
            arr3[i]=each;
            i++;
        }
        for (int each:arr2){
            arr3[i]= each;
            i++;
        }
        System.out.print(Arrays.toString(arr3));
        System.out.println();
    }

    // task04;
    public static void posnegzero(int num){
        if (num>0){
            System.out.println(num+" is positive");
        }else if (num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+ " is zero");
        }
    }


    public static void addition(int a,int b) {
        int sum = a + b;
        System.out.println(sum);

        }
    }
