package assignments4;

import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);

        String inhabits1 = "Inhabits are ";
        int inhabits = zuko.nextInt();


        System.out.println(inhabits1+inhabits);
        int a= 0;
        for (int i=inhabits;i>=1;){
            //i=i/2;
            System.out.println("Day "+a+" "+"["+i+"]");
            i=i/2;
            a++;
        }
        System.out.println("EXTINCT");












    }
}
