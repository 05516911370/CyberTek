package assignments2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class palindromeTest {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);
        String str = zuko.nextLine();


        String reversedStr = "";

        for (int i =str.length()-1; i>=0; i--){
            reversedStr+=str.charAt(i);
          //reversedStr+= str.substring(i,i+1);
        }
        System.out.println(reversedStr);

        System.out.println(str.equalsIgnoreCase(reversedStr));











    }
}
