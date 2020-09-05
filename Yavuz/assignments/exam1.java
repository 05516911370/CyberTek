package assignments;

import java.util.Scanner;
public class exam1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.println("Enter Item1 and its price");

        String item9 = input.nextLine();
        double price9 = input.nextDouble();

        input.nextLine();
        System.out.println("Enter Item2 and its price");

        String item10 = input.nextLine();
        double price10 = input.nextDouble();
        input.nextLine();

        System.out.println("Enter Item3 and its price");

        String item11 = input.nextLine();
        double price11 = input.nextDouble();


        double totalPrice1= price9+price10+price11;

        System.out.println("Item1+: "+ item9 + "Price:"+price9+","+"Item2:"+ item10+ "Price:"
                +price10+","+"Item3:"+ item11+ "Price:"+price11);

        System.out.println("totalPrice1"+totalPrice1);






    }
}

