package assignments2;


import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your current count");
        int senior = input.nextInt();
        int senio2 = input.nextInt();
        int seniorcitizen = input.nextInt();


        System.out.println("What is new citizen's age?");

        if (seniorcitizen>=65){
            senior++;
            System.out.println("Senior");
        }else if(seniorcitizen<65){
            senio2++;
            System.out.println("Non bender");
        }

        System.out.println("New seniors count: "+senior);
        System.out.println("New non bender count: "+senio2);










    }
}
