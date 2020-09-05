package day34_WrapperClasses;

import java.util.Arrays;

public class wrapperClass {
    public static void main(String[] args) {

        Integer num =100;
        int a=100;

        byte t = 100;
        int z =t;

        Byte b1 = 50;
        int n1=b1;

        Integer n3 = new Integer(123);

        Integer[] arr = new Integer[3];

        System.out.println(Arrays.toString(arr));

        int p1 =300;
        Integer p2 = p1; // Autoboxing

        Integer q1 = 500;
        int q2 = q1; // unboxing

        Double r1 = 300.0; // unboxing
        double r2=r1;

        long l1 = 400;
        Long l2 = l1;

        Float f1 = 100.5f;
        Float f2 = f1;
    }
}
