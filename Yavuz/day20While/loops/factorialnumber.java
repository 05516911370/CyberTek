package day20While.loops;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class factorialnumber {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);

        double result = 1;//5*4*3*2*1==120

        for (int i = zuko.nextInt(); i>=1;i--){

            if (i==0){
                break;
            }
            result=result*i;
        }
        System.out.println(result);

















    }
}
