package assignments4;

import java.util.Scanner;


public class repeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String a="";

        for (int i = 1; i < count;i++) {
            a = a + word + separator;
        }
            if (count==1){
                System.out.println(word);

            }else{
                System.out.println(a+word);
            }




        }
    }


