package day33;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeformating {
    public static void main(String[] args) {

        /*
        month: MM
        day: dd
        year: yy/yyyy
         */
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate ld = LocalDate.of(2020,7,25);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));


        /*
          hours: hh
          minutes: mm
          seconds: ss
          am/pm: a
        */

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        DateTimeFormatter DTformat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTformat));

        System.out.println(LocalDateTime.now().format(DTformat));

        //Saturday 4:34:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);
        System.out.println(Now.format(dtf));
        
    }
}
