package day06IfStatements;

public class MedianNumber_ {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        boolean aIsTheMedian = (b > a && a > c ) || ( c > a && a > b );
        //in order for a a to be median number between three numbers
        // a need to be less than b and greater than c or a need to be less than c and greater than b

        boolean bIsTheMedian = !aIsTheMedian && (c > b || c>a);
        // or diffrenet expresion  bu
        boolean bIsMedian = ( a > b && b > c) || ( c > b && b > a);

        boolean CIsMedian = !aIsTheMedian && !bIsMedian;
        // if both a and b is that mediam than c must be the median number






    }
}
