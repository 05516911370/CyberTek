package assignments;

import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your code here: ");

        int coupuons = scan.nextInt();

        //coupuons==15 then a==1 coupuons

        int a= coupuons/10;
        int b= coupuons%10/5;

        if(a>=1){
            System.out.println("This one has: "+a+" times coupuons");
        }else {
            System.out.println(a+" doesnt have ocupuons");
        }
        if (b>=1){
            System.out.println(b+" has osmething");
        }else {
            System.out.println(b+" doesnt ahve something");
        }






    }
}
