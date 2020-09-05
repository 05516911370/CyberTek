package assignments3;

import java.util.Scanner;

public class McDonalds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String food = scan.next();
        float burger=10,soda=2;



        if (food.equals("burger")||food.equals("chicken")){
            System.out.println("output: "+burger);

        }else if (food.equals("soda")){
            System.out.println("output"+soda);
        }else{
            System.out.println("failed");
        }


















    }
}
