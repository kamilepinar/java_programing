package day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);//simdiyi verir now method


        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);

        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());//ogun hangi gun olucak tuesday
        System.out.println(starts.getHour());//suan ki zamani verdi




    }
}
