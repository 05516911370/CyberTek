package day20While.loops;

import java.util.Scanner;

public class whileLoop_Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        String name = scan.next();
        int i = 0;
        int num= scan.nextInt();
        while (i<=num){
            System.out.println(name);
            i++;
        }

        System.out.println("=====================================");

        String str = "Cybertek";

        int index = str.length()-1;
        String result = "";
        while (index>=0){

            result+= str.charAt(index);

            index--;
        }

        System.out.println(result);


        System.out.println("==========================");*/

        System.out.println("Enter you password");

        String password = "Yavuz";

        String password1 = scan.nextLine();

            while (!password1.equals(password)) {

                System.out.println("please re-enter your password");
                String or = scan.nextLine();

            }

            System.out.println("Logged in");


    }








    }

