package day28;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;

        String[]arr= {"Java","C#","Python","Java","jAvA"};
        String k="java";


        for (String each:arr){
            if (!k.equalsIgnoreCase(each)) {
                continue;
            }
            count++;
        }
        System.out.println(count);












    }
}
