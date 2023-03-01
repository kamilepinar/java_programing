package day19_array;

import java.text.DecimalFormat;

public class decimalFormatPractice {
    public static void main(String[] args) {


        DecimalFormat df =new DecimalFormat("0.00");

        double n1 =10.3214;// noktadan sonrasini yuvalamak icin yapiyo. 0.0 yada 0.00 yada 0.00 yapabilirsin ne istersen
    // eger 5 ve ustu ise yuarlar yoksa10.32 diye cikariyor ama 10.5879 olsaydi 10.59 olucakti
        System.out.println(df.format(n1));
    }
}
