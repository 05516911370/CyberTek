package assignments4;
import java.util.*;
public class arrays_Printing01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] arr = new String[5];
        for (int i =0;i<5;i++){
            arr[i]=scan.nextLine();
        }

        for (int j=0;j<5;j++){
            if (arr[j].length()<3){
                continue;
            }
            System.out.println(arr[j].substring(0,3));
        }

        System.out.println("napioy");













    }
}
