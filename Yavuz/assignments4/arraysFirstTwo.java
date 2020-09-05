package assignments4;

import java.util.*;

public class arraysFirstTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names={scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};

        for (String each:names){
            System.out.println(each.substring(0,1)+each.substring(each.length()-1));
        }






    }
}
