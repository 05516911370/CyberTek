package day18;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "abasiyanik@gmail.com";
        System.out.println(email.length());
        int index = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        System.out.println(index);
        System.out.println(index2);
        System.out.println("Put your email address");

        String domain = email.substring(index+1,index2-1);

        System.out.println(domain);










    }
}
