package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); //now method  give todays date local dates are immutable

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1985,12,20);
        System.out.println(birthday);

        System.out.println("---------------------------------------    -----------------------");

        System.out.println(today.getYear() );//2022
        System.out.println(today.getMonth());//november
        System.out.println(today.getMonthValue());//11
        System.out.println(today.getDayOfMonth());//20

        System.out.println("---------------------------------------------------------------");

        System.out.println(today.getDayOfWeek());//sunday
        System.out.println(today.getDayOfMonth());//20
        System.out.println(today.getDayOfYear());//324
        System.out.println(birthday.getDayOfWeek());//friday

        System.out.println("------------------------------------------------------");
//1 year from todays day
        today = today.plusYears(1);//you need to assign it
        System.out.println(today);
        LocalDate gruadutionDate = LocalDate.of(2025,11,20);

       gruadutionDate = gruadutionDate.plusYears(2);

        System.out.println(gruadutionDate);

        gruadutionDate = gruadutionDate.plusMonths(7);

        System.out.println(gruadutionDate);

        gruadutionDate =gruadutionDate.plusWeeks(7);

        System.out.println(gruadutionDate);

        gruadutionDate =gruadutionDate.plusDays(100);

        System.out.println(gruadutionDate);

        System.out.println("--------------------------------------------------------------");

        // localday of belirledigin bi zaman icin kullaniyor, now bugunun gunu ici kullaniliyor
        LocalDate yourBirthday = LocalDate.of(1985,12,20);
       LocalDate yourBrotherBirthday=yourBirthday.minusYears(2).minusMonths(1);// older brother born before

        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthday);


        System.out.println("----------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1994,7,7);

        boolean r1 =birthday1.isEqual(birthday2);

        System.out.println(r1);

        System.out.println("---------------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(  grad_date.isBefore(  LocalDate.of(2022, 12, 31) ));
        System.out.println(  grad_date.isAfter(  LocalDate.of(2022, 12, 31) ));

        System.out.println("----------------------------------------------");

        System.out.println(  LocalDate.of(2022, 11, 20).isLeapYear()  );


    }
}
