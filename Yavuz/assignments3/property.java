package assignments3;

import java.util.Scanner;

public class property {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double propertyPrice = 0;
        int numberOfdrooms, garagespots;
        double metroAccestibility,schoolScore, highwayAccestibility;
        String housetype,backyard,smoking,garage;

        System.out.println("Enter your property type:");
        housetype = scan.next();
        if (housetype.equals("Condo")){
            propertyPrice=propertyPrice+50000;
        }else if (housetype.equals("Townhouse")){
            propertyPrice=propertyPrice+75000;
        }else if (housetype.equals("singlefamily")){
            propertyPrice=propertyPrice+95000;
        }
        System.out.println("Do you have a backyard?");
        backyard=scan.next();
        if (backyard.equals("yes")){

        }if (true){
            if (housetype.equals("Townhouse")||housetype.equals("singlefamily")) {//housetype.equals("Townhouse")||housetype.equals("singlefamily")
                propertyPrice = propertyPrice+5000;
            }else if(backyard.equals("no")){
                System.out.println("It doesnt have it");
            }else if(housetype.equals("Condo")){
                System.out.println("Backyard is not available for Condo");
            }
        }
        System.out.println("How many bedrooms do you have?");
        numberOfdrooms=scan.nextInt();
        for (int i=numberOfdrooms;i>=0;i=-1){
            propertyPrice=propertyPrice+i*30000;
        }

        System.out.println("Do you have garage?");
        garage=scan.next();
        if (garage.equals("no")){
        }else if(garage.equals("yes")){
            System.out.println("How many spots?");
            garagespots=scan.nextInt();
            for (int i1=garagespots;i1>=0;i1=-1){
                propertyPrice=propertyPrice+(i1*20000);

                if (i1>10) {
                    System.out.println("Pardon, its not public parking");
                    propertyPrice = propertyPrice - (i1 * 20000);
                }
            }
        }
        System.out.println(" How close is metro station?");
        metroAccestibility=scan.nextFloat();
        if (metroAccestibility<1){
            propertyPrice=propertyPrice+10000;
        }else if(metroAccestibility>=1&&metroAccestibility>=3){
            propertyPrice=propertyPrice+5000;
        }else{
            System.out.println("");
        }

        System.out.println("How close is highway?");
        highwayAccestibility=scan.nextFloat();
        if (highwayAccestibility<1){
            propertyPrice=propertyPrice+15000;
        }else if (highwayAccestibility>=1&&highwayAccestibility<=5){
            propertyPrice=propertyPrice+8000;
        }else if (highwayAccestibility>=5&&highwayAccestibility>=20){
            propertyPrice=propertyPrice+4000;
        }

        System.out.println("What is rating of nearest school?");
        schoolScore=scan.nextFloat();
        if (schoolScore<=10&&schoolScore>8){
            propertyPrice=propertyPrice+45000;
        }else if (schoolScore<=8||schoolScore>=4){
            propertyPrice=propertyPrice+20000;
        }else{
            propertyPrice=propertyPrice+5000;
        }
        System.out.println("Do you smoke?");
        smoking=scan.next();
        if (smoking.equals("yes")){
            propertyPrice=propertyPrice-5000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimated market price is: "+propertyPrice);












    }
}
