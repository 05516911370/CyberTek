package day32_MethodOverLoading;

import java.util.Scanner;

public class formatFullName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String first = scan.nextLine();
        String second= scan.nextLine();

        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        second=second.substring(0,1).toUpperCase()+second.substring(1).toLowerCase();

        String fulname= first+" "+second;

        System.out.println(fulname);
    }
}
