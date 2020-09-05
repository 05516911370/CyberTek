package day23;

import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        char ch []=str.toCharArray();


        System.out.println(Arrays.toString(ch));
        System.out.println("====================================");
        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[]ch1= str1.toCharArray();
        Arrays.sort(ch1);
        char[]ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));
        System.out.println("=================================");

        //split

        String sentence= "I love Programming Language";

        String[]word = sentence.split(" ");
        System.out.println(Arrays.toString(word).length());

        for (int i=word.length-1;i>=0;i--){
            System.out.print(word[i]+" ");
        }

        System.out.println("");
        System.out.println("====================================================");

        String s ="JAVA";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));















    }
}
