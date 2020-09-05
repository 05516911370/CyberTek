package day33;

import java.time.LocalDate;
import java.util.Scanner;

public class dates {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000,6,3);
        // year-month-day

        System.out.println(date);


        LocalDate today =LocalDate.now();
        System.out.println(today);

        LocalDate year = LocalDate.of(2029,1,1);
        boolean a=year.isLeapYear();
        System.out.println(a);

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a year");
        int year1 = scan.nextInt();

        boolean result2 = LocalDate.of(year1,1,1).isLeapYear();
        System.out.println(result2);
        System.out.println("==================================");
        System.out.println("Enter birth year, birth month, birth day");

        LocalDate d = LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println(d);
        System.out.println(d.isLeapYear());

    }
}
