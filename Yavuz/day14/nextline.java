package day14;
import java.util.Scanner;
public class nextline {
    public static void main(String[] args) {
        Scanner boomMan = new Scanner(System.in);

        System.out.println("Enter first age: ");
        int age = boomMan.nextInt();

        boomMan.nextLine();

        System.out.println("Enter your full name: ");

        String name = boomMan.nextLine();

        System.out.println(name+ " is "+ age+ " years old.");

        System.out.println("What is your second name?");

        String name2 = boomMan.nextLine();

        System.out.println(name2+" is his second name.");

    }
}
