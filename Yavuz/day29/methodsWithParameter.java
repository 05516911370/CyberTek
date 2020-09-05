package day29;

import java.util.Scanner;

public class methodsWithParameter {


    public static void main(String[] args) {
        printHello(5);
        System.out.println("============================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        /* int birthyear= scan.nextInt();
            int currentyare = scan.nextInt();
         */

        age(scan.nextInt(), scan.nextInt());
    }






    public static void printHello(int numebrOfTimes){
    for (int i =0; i<numebrOfTimes;i++){
        System.out.println("Hello world");
    }
    }


    public static void age(int birthyear, int currentYear){
        if (currentYear<birthyear){
            System.out.println("Invalid Entry");}
        int agee=currentYear-birthyear;
        System.out.println("You are "+ agee+" years old");

        }








}
