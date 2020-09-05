package day14;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number: ");

        int num = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street address-");

        String streetAdress = input.nextLine();

        System.out.println(" Enter your city name: ");

        String cityName = input.nextLine();

        System.out.println("Enter your state name: ");

        String stateName = input.next();

        System.out.println("Enter your ZIP code: ");

        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();

        System.out.println(fullName+"\n"+num+ " "+ streetAdress+ "\n"+ cityName+", "+stateName+" "+ zipCode );


        input.close();

    }
}
