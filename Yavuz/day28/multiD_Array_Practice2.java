package day28;

import java.util.Arrays;

public class multiD_Array_Practice2 {
    public static void main(String[] args) {

        int array2D[][]={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i= array2D.length-1;i>=0;i--){
            int[] a=array2D[i];
            for (int j=a.length-1;j>=0;j--){
                System.out.print(a[j]+" ");

            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int i=0;i<=array2D.length-1;i++) {
            int[] a = array2D[i];
            for (int j=a.length-1;j>=0;j-- ){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }






    }
}
