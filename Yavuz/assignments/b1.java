package assignments;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = can.nextInt() ;
        System.out.println("Enter number2:");
        int num2 = can.nextInt();

        String okay ="nothing";
        int largerNum= (num1>num2)? num1:num2  ;
        String nothing = (num1==num2)?okay:"k";
        System.out.println(largerNum+ " is larger");
        System.out.println(nothing);
        System.out.println("==================");

    int a = 100;
    int b= 2000;
    int c = 300;

    boolean fh=  a>b && a>c;
    boolean hf = !fh  && b>c;
    boolean fgh = !fh && !hf;
    
    String lan = "";

    if (fh){
        lan = "napiyon lan";
    }else if(hf){
        lan= "9";
    }else if (fgh){
        lan="okay";
    }else{
        lan="nothing";
    }

        System.out.println(lan);






















    }
}
