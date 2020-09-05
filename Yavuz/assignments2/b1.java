package assignments2;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner avatar = new Scanner(System.in);

        String name = "";
        String name1 = avatar.next();

        name = (name1.equalsIgnoreCase("Chen"))? "Teacher":"Student";
        System.out.println(name);










    }
}
