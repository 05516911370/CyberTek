package assignments4;

import java.util.Scanner;

public class Arrayssplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        int wai=email.indexOf("@");
        int lak =email.indexOf(".");

        String a= email.substring(0,wai);
        String b = email.substring(wai+1,lak);
        String c = email.substring(lak+1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);






    }
}
