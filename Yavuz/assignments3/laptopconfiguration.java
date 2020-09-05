package assignments3;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class laptopconfiguration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;


        System.out.println("Select screen size");
        double screenSize = scan.nextDouble();
        if (screenSize==13.3){
            price=price+200;
        }else if(screenSize==15.0){
            price=price+300;
        }else if(screenSize==17.3){
            price=price+400;
        }

        System.out.println("Select CPU type");
        cpu=scan.next();

        if (cpu.equals("i3")){
            price=price+150;
        }else if(cpu.equals("i5")){
            price=price+250;
        }else if(cpu.equals("i7")){
            price=price+350;
        }
        System.out.println("Select RAM size");
        ram=scan.nextInt();
        int i =ram/4;
        price=price+i*50;

        System.out.println("Select strorage type");
        storageType=scan.next();

        if (storageType.equals("HDD")){
            System.out.println("Enter memory size");
            int memoryziee= scan.nextInt();
            int a3= memoryziee/500;
            price=price+a3*50;
        }else if(storageType.equals("SSD")){
            System.out.println("Enter memory size");
            int memoryziee1= scan.nextInt();
            int a4= memoryziee1/500;
            price=price+a4*100;
        }

        System.out.println("Enter your screen resolution");
        String resolution = scan.next();
        if (resolution.equals("FULLHD")){
            price=price+100;
        }else if(resolution.equals("4K")){
            price=price+200;
        }
        System.out.println("Laptop price: "+price);



















    }
}
