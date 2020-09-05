package assignments4;

import java.util.Scanner;

public class Arrays_printing3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]arr= new String[6];
        for (int i =0; i<6;i++){
            arr[i]= input.nextLine();
        }

        for (int j=0;j<3;j++) {
            System.out.print(arr[j]+ " ");

        }
        System.out.println();

        for (int a=1;a<4;a++){
            System.out.print(arr[a]+ " ");

        }
        System.out.println();

        for (int a=2;a<5;a++){
            System.out.print(arr[a]+ " ");

        }
        System.out.println();
        for (int a=3;a<6;a++){
            System.out.print(arr[a]+ " ");

        }


    }

    }

