package day22;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String days[]=new String[7];
        days[6] = "sunday";
        days[5] = "saturday";
        days[4] = "friday";
        days[3] = "thursday";
        days[2]="wednsday";
        days[1] = "tuesday";
        days[0] = "monday";

        for (int i = 0; i<= days.length-1;i++){
            System.out.print(days[i]+" ");
        }


        System.out.println("=============================");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter num");

        int n = scan.nextInt();

        System.out.print(days[n-1]+" ");




        int[ ]arr = {10,20,3,4,5,6,7,-10,-100,300,400};

        //write a program that can return the mind and maximum numebr from the array






















































    }

}
