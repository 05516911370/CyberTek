package assignments2;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name pls mf");

        String name = scan.nextLine();
        name= name.trim();

        String print = "";

        print = ((name.equalsIgnoreCase("Alex bilmo"))||(name.equalsIgnoreCase("lele lele")))? "Evet":"Hyiar";
        System.out.println(print);








    }
}
