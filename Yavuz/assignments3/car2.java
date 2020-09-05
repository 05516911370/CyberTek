package assignments3;

import java.util.Scanner;

public class car2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double premium = 0;
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Do you have driver license?");
        String license1 = scan.next();
        boolean license = license1.contains("yes");

        if (!license){
            System.out.println("Invalid data!!");
            System.exit(0);
        }
        System.out.println("What is your zip code?");
        int zip = scan.nextInt();

        switch (zip){
            case  20910:
                premium+=60;
                break;
            case 20740:
                premium+=60;
                break;

            case  22102:
                premium+=30;
                break;
            case  22103:
                premium+=30;
                break;
            default:
                premium+=50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String ownned = scan.next();

        if (ownned.equals("Owned")){
            premium+=10;
        }else{
            premium+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        String carUsage = scan.next();

        if (carUsage.equals("Business")){
            premium+=50;
        }else if (carUsage.equals("Pleasure")){
            premium+=10;
        }else if (carUsage.equals("Commute")){
            premium+=20;

            System.out.println("Days Driven To Work And/Or School");
            int dayDriven = scan.nextInt();

            for (int i = 0; i<=dayDriven;i++){
                premium+=5;
            }

            System.out.println("Miles Driven To Work And/Or School");
            double miles = scan.nextDouble();
            for (int i = 0; i<=miles;i++){
                premium+=1;
            }
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age<16){
            System.out.println("Invalid date");
            System.exit(0);
        }else if (age>=16&&age<18){
            premium=premium*20;
        }else if (age>=18&&age<21){
            premium=premium*6;
        }else if (age>=21&&age<25){
            premium=premium*2;
        }
        System.out.println("Your experiecen");
        int experience = scan.nextInt();

        if (experience<0||age-experience<=16){
            System.out.println("Invalid");
            System.exit(0);
        }

        for (int i =0;i<=experience;i++){

            premium=premium-5;
        }
        System.out.println( "Have you had any accidents in the last 5 years?");
        String accidents = scan.next();

        if (accidents.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            int howMany = scan.nextInt();
            for (int a = 0; a <= howMany; a++) {
                premium = premium +(premium/20);
            }
        }
        System.out.println( "Have you had continuous insurance for the past 12 months?");
        String insrunce = scan.next();

        if (insrunce.equalsIgnoreCase("no")){
            premium=premium*2;
        }
        System.out.println("What is the highest level of education you have completed?");
        String education = scan.next();

        switch (education){
            case "PhD":
            case "Bachelors":
            case"Masters":
                premium=premium-(premium/5);
                break;
            case "Doctors":
                premium=premium-(premium/10);
                break;
            case "High School":
                premium=premium+(premium/5);
                break;
        }

        System.out.println(name+" here is your quote");
        System.out.println("Start your policy today for: "+premium);

        char first = name.charAt(0);
        char second1 = name.charAt(1);

        String referenceNumber = ""+first+second1+""+age+name.charAt(name.length()-2)+name.charAt(name.length()-1)
                +zip+education;
        referenceNumber = referenceNumber.toUpperCase();
        System.out.println("Reference number: "+referenceNumber);



        /*
        Then display message with reference number: "Reference number:
        referenceNumber". In order to build reference number variable (referenceNumber),
        concatenate first 2 letters of customer's name, age,  last 2 letters of of
        customer's  name, zip code,  and level of education without spaces. This value
        should be all upper case!*/









    }
}
