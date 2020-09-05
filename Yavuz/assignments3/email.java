package assignments3;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String email = scan.nextLine();

        int a = 0, b=0,c=0;

        if (email.contains("_")&&email.contains("@")&&email.contains(".")){
            a=email.indexOf("_");
            b=email.indexOf("@");
            c=email.indexOf(".");

        }

        System.out.println("First name: "+(""+email.charAt(0)).toUpperCase()+email.substring(1,a));
        System.out.println("Last name: "+ email.substring(a+1,b));
        System.out.println("Doman: "+ email.substring(b+1,c));
        System.out.println("Top level: "+email.substring(c+1));










    }
}
