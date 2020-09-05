package day33;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class times {
    public static void main(String[] args) {

        LocalTime a=LocalTime.of(23,45,55);
        System.out.println(a);

        LocalTime a2= LocalTime.now();
        System.out.println(a2);

        LocalDateTime a3 = LocalDateTime.of(2020,07,25,15,25);

        System.out.println(a3);

        LocalDateTime a4 = LocalDateTime.now();
        System.out.println(a4);


    }
}
