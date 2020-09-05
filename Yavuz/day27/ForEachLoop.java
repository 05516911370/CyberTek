package day27;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []arr= {1,2,3,4,5};

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("========================================");

        for (int j:arr){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("=====================================");

        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("===================================");

        // when to use "for each" loop?
        // when you wont use index

        int[] scores = {10,20,30,40,50,60,70,80,90,100,110};
        int countdivisible=0;

        for (int a:scores) {
            if (a %3 != 0) {
                continue;
            }
                countdivisible++;
                System.out.print(a+" ");

        }

        System.out.println();
        System.out.println(countdivisible);

        System.out.println("===============================================");

        String[] names = {"AB","ABC","A","AB","ABCD"};
        int coundtC=0;
        for (String a:names){
            if (a.contains("C")){
                System.out.print(a+" ");
                coundtC++;
            }
        }
        System.out.println();
        System.out.println(coundtC);
        System.out.println("==================================================");

        int [] score = {100,75,65,110,90,45,56,78};

        int max = score[0];
        int min = score[0];

        for (int each:score){

            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);






















    }

}
