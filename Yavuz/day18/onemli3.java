package day18;

import java.util.Scanner;

public class onemli3 {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);
        int a,b,c,d,e,f,g,h,j,k,l,m,n,o,p,r;

        System.out.println("Enter your first num:");
        a = zuko.nextInt();

        System.out.println("Enter your second num:");
        b=zuko.nextInt();

        System.out.println("Enter your third num:");
        c=zuko.nextInt();

        boolean a1,b1,c1;

        a1= (a>b&&a<c)||(a>c&&a<b);
        b1= (b>a&&b<c)||(b<a&&b>c);
        c1= (!a1)&&(!b1);

        if (a1){
            System.out.println("Medium number is "+a);
        }else if (b1){
            System.out.println("Medium number is "+b);
        }else if (c1){
            System.out.println("Medium number is "+c);
        }













    }
}
