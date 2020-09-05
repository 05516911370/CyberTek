package Strings;

import java.util.Scanner;

public class string_practice {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstname = string.next();

        char ch1 = firstname.charAt(0);

        String lastname = string.next();

        char ch2 = lastname.charAt(0);

        System.out.println("Your initial is: "+ch1+", "+ch2);

        int lastindexnumber = lastname.length() -1;
        System.out.println(lastindexnumber);
        char lastchar = lastname.charAt(lastindexnumber);
        System.out.println(lastchar);


        //concat(Str):

        String schoolName = "Cybertek";
        schoolName=  schoolName.concat("School");
        System.out.println(schoolName);

        System.out.println("==================================");

        System.out.println("Enter your first name");

        String a = string.next();

        System.out.println("Enter your last name");

        String b = string.next();


        String fullname = a.concat(" ".concat(b));
        System.out.println(fullname);








    }
}
