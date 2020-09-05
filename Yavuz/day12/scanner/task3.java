package day12.scanner;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner azula = new Scanner(System.in);

        System.out.println("Enter your annual salary: ");
        double salary = azula.nextDouble();
        System.out.println("How many hours do you work in a week?");

        int weeklyHour = azula.nextInt();
        int totalHours = weeklyHour*52;
        double hourlyRate = salary/totalHours;
        System.out.println("Your hourly rate is "+ hourlyRate);

















    }
}
