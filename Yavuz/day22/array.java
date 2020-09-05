package day22;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        //String stundets = "Muhtar", "Nadir" ,"Nadire";

        String[] students = {"Cybertek","Muhtar","Nadir"};

        String name1 = students[2];



        System.out.println("====================================");

        int[] scores = {85,70,95,90,100};
        String[] name = {"Mike","Adam","Tonny","John","Amy"};

        for (int i = 0; i<=4;i++){
            System.out.println(name[i]+" : "+ scores[i]);

        }

        /*
        System.out.println(name[0]+ " : "+ scores[0]);
        System.out.println(name[1]+" : "+ scores[1]);
        System.out.println(name[2]+" : "+ scores[2]);
        System.out.println(name[3]+" : "+ scores[3]);
        System.out.println(name[4]+" : "+scores[4]);
*/


        System.out.println("===============================");

        String[] classmates = new String[5]; //size is 5,
        classmates[0] = "Fatih";
        classmates[2]= "Hazel";
        classmates[1] = "Viorel";
        classmates[3]= "Elkem";
        classmates[4] = "Ahmed";
        for (int i = 0; i<=classmates.length-1;i++){
            System.out.println(classmates[i]);
        }













    }
}
