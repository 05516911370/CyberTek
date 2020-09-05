package day30;

import java.util.Scanner;

public class returnMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Level";

        String reversedName = revStr2(name);
        System.out.println(name.equalsIgnoreCase(revStr2(name)));
    }

    public static void revStr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }


    public static String revStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        System.out.println(result);
        return result;


    }
}



















