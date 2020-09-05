package day28;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int[]arr1D={1,2,3};
        int[][] arr2D= {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        //[4,5,6,7,8]
        System.out.println(Arrays.toString(arr2D[1]));

        //[1,2,3]
        System.out.println(Arrays.toString(arr1D));


        // 7
        System.out.println(arr2D[1][3]);

        System.out.println("======================================");

        for (int i=0; i<=arr2D.length-1;i++){
            int[] each1Darray = arr2D[i];
            //System.out.println(Arrays.toString(each1Darray));
        for (int j=0;j<=each1Darray.length-1;j++) {
            int a = each1Darray[j];
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
            System.out.println();
        }

        System.out.println("======================================");


        for (int[] each1D:arr2D){
            for (int eachElement: each1D){
                if (eachElement%2!=0){
                System.out.print(eachElement+" ");

                }
            }
            System.out.println();
        }



































    }
}
