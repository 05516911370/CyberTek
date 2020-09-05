package day33;

import java.util.Arrays;

public class calculate {

    public static void main(String[] args) {
        double a = 29;
        double b=30;
        System.out.println(addition(a,(int)b));
        float num1 =10;
        float num2=9;

        System.out.println(addition((int)num1,(int)num2));
        System.out.println(addition(90,5.5));
        System.out.println(addition(0.5,2));

        int arr[]={4,3,2,1};
        Arrays.sort(arr);

        char[] arr2 = {'C','B','A'};
        Arrays.sort(arr2);


        long l1 = 100;
        long l2 =200;

        System.out.println(multiplication((int)l1,(int)l2));


    }
    public static int addition(int a, int b){
        return  a+b;
    }
    public static double addition(double a,double b){
        return a+b;
    }
    public static double addition(double a, int b){
        return a+b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }






















}
