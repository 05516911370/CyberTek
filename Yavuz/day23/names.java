package day23;

import java.util.Arrays;
import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("How many people in family");
        int num = scanner.nextInt();

        System.out.println("Names");
        String names []= new String[num];

        for (int i = 0 ; i<=names.length-1;i++){
            System.out.println(names[i]);
        }
        Arrays.toString(names);
        System.out.println(names);








    }
}
