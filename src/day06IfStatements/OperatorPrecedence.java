package day06IfStatements;

public class OperatorPrecedence {


    public static void main(String[] args) {


        System.out.println(5 + 2 * 3 );
        // order first * so 5 + 6 =11
        System.out.println( 7+ 3 - 2 /2);
        //                  7 + 3 - 1//------> 9 sonuc
        // = ve - ayni order sirasinda o yuzden ilk hangi yapilirsa o yapiliyo
        // yani burda arti yapilcak
        // 7+3=10-1====>9


        System.out.println(-5 + 3 );
         //                 -2


        System.out.println(10 > 9 == 8 < 7);
        //                 true   ==  false =====> final is false// true not equal to false


        // equal operator is before and&& and and is before || // look for precedence of all operator

        System.out.println( 10 > 9 == 8 < 7   &&  "Java" == " Python" || 'a' == 'A' );
//                          true == false   &&     false              || false
        //                  false && false        sonra  or || false// ama sonuc yine false :)
        // ama true or false o zaman true olurdu
        System.out.println("======================================");

        System.out.println( 100 >= 20  && 40 *2 > 60 );
        //                    true   and 80> 60 true =====> true // once carpma sonra buyuktur esittir sonra end sonra or


        System.out.println("=======================================");//shorthand operator is latest one

        int a = 20;

        a += 10 + 2 *3 ;

        // first * 2*3=6 second addition 10 + 6=16 third a+= 20+16 arttiriiyo = 36







    }


}
