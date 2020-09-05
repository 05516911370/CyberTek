package assignments2;

import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);
    int a,b,c,d,e;

        //task1
    for (a = 1; a<=99; a=a+2){
        if ((a%3==0)&&(a%5==0)){
            System.out.print(a+", ");
        }
    }
        System.out.println("        ");

         //task2
        for (a = 0; a<=100; a++){
            if (a%2==0) {
               if ((a % 3 == 0) && (a % 5 == 0)) {
                   System.out.print(a + ", ");
               }
           }
        }
        System.out.println(" ");
        System.out.println("===========================");

        //task3
        c=0;
        for (b=0;b<=100;b=b+2){


            c+=b;
        }
         System.out.print(c);














    }
}
