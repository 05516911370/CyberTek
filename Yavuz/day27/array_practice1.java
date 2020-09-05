package day27;

import java.util.Arrays;
import java.util.Scanner;

public class array_practice1 {
    public static void main(String[] args) {

        String[] names ={"Aalia","Nurbiye","Ayse","aysa","hebele"};

        System.out.println(names[1]);

        System.out.println("===============================");

        for (int i =0; i<=names.length-1;i++){
            if(!names[i].startsWith("A")){
            continue;
            }
                System.out.println(names[i]);

        }
        System.out.println("===========================================");

        int numebers[]= new int[5];

        numebers[3]=25;
        numebers[0]=100;

        System.out.println(Arrays.toString(numebers));
        System.out.println("==============================");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");
        int n = scan.nextInt();
        String [] stundet = new String[n];

        scan.nextLine();
        for (int i =0; i<=n-1;i++){

            System.out.println("Enter a name");
            stundet[i] = scan.nextLine();
        }




        System.out.println(Arrays.toString(stundet));






















    }
}
