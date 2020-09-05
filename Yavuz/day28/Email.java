package day28;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "cybertek@gmial.com";
        String name=email.substring(0,email.indexOf("@")) ;
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println(name);
        System.out.println(domain);















    }
}
