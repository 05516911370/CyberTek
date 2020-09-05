package day20While.loops;
import java.util.Scanner;
/*
 1. Write a program that calculates the sum of numbers entered by the user until user enters a negative
  hint: you need an infite loop
 */
public class UntilNegative {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i==0;){
            System.out.println("Enter a number: ");
            int num =zuko.nextInt();

            if (num<0){
                break;
            }
            sum+=num;
        }
        System.out.println("sum is "+sum);






















    }

}
