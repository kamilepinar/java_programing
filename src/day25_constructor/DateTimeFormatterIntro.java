package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        //if you want to formatt the date and time  you need to import from formatter class

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/y EEEE");//"yy" koyarsa sadece 22 cikarir yili
                                                                   // yMMM 2022Nov
                                                                   //yMMMM 2022November
                                                                   //bosluk bosluk / slash verir araya
     //2022/Nov/22-->"y/MMM/d"
        //november/22/22 tuesday ->  MMM/dd/y EEEE

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022, 7, 1);

        System.out.println(date1.format(df));  // burda yaptigin format neyse o sekil cikar


        DateTimeFormatter tf  = DateTimeFormatter.ofPattern("hh:mm a");//HH olsaydi17 olurdu
                                                            //hh: 17 05 cikarir
                                                             // a =am or pm
        LocalTime time1 = LocalTime.of(17, 30);

        System.out.println( time1.format(tf) ); //07:05




        //local date time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");
        //                                               tuesday, Nov/22/2022  11:13 AM
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));



    }
}
/* y= 4 digit year
   yy =2 digit year
   M =Months number
   MM=05 with o months
   MMM =jan feb mar
   MMMM =januaryfebruary
   d =day num
   dd =day number  01 02
   E day name monday tuesday
   EEE = mon tue
 */