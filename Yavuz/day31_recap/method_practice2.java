package day31_recap;

import java.util.Scanner;

public class method_practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a=reverse(scan.nextLine());
        System.out.println(a.toUpperCase());

        System.out.println(scan.nextLine().equalsIgnoreCase(a));
    }


    public static String reverse(String str){
        String expectedresult="";
        for (int i=str.length()-1;i>=0;i--){
            expectedresult+=str.charAt(i);
        }
        return expectedresult;
    }
}
