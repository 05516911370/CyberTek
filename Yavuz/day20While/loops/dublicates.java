package day20While.loops;

import java.util.Scanner;

public class dublicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String result = "";//

        for (int i = 0;i<=str.length()-1;i++){
            String s = ""+str.charAt(i);//a, a, b, b
            if (!result.contains(s)){//if the character is already contained in result, we will not have it
                result+=s;
            }
        }
        System.out.println(result);


/*
        String str = "aabb";

        String result = "";//"ab

        for (int i = 0;i<=str.length()-1;i++){
            String s = ""+str.charAt(i);//a, a, b, b

            if (result.contains(s)){
                contunie:
            }
        result+=s;
        }

        System.out.println(result);
*/





    }
}
