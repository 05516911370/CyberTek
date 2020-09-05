package day22;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);






        String[] months = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("Enter a number between 1~12");
        int n = scanner.nextInt();// 3

        System.out.println(months[n-1]);






    }
}
