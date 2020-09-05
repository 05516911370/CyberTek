package assignments3;

import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);


        System.out.println("player");

        int player = zuko.nextInt();
        System.out.println("house");
        int house = zuko.nextInt();


        if (player>=21){
            System.out.println("bust");
        }else if (player>house){
            System.out.println("player wins");
        }else if(player==house){
            System.out.println("its a tie");
        }else if(player<house){
            System.out.println("player loss");
        }







    }
}
