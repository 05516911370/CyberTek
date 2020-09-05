package azula;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DENEME2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] list = {1,2,1,3,4,4,5};

        int count =0;


        for (int each:list){
            count=0;
            for (int each1: list){
                if (each==each1){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each);
            }
        }


    }
    }



