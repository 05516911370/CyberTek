package assignments2;

import java.util.Scanner;

public class forloops3 {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);
        //task7
        System.out.println("Enter a num:");

        int num = zuko.nextInt();

        int sum= 0;

        if (num>1){
            for (int i = 1; i<=num; i++){
                //sum=sum+i
                sum+=i;
            }
            System.out.println(sum);
        }else {
            System.out.println("Invalid num");
        }














    }
}
