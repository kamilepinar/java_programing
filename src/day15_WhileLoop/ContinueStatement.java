package day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if(i==2){
                continue;// bunu yapinca 2 yi yazmaz
            }
            System.out.println(i);// 12345 verdi if you want to skip the 4 you give continue
        }


        System.out.println("----------------------------------------");

        for (int i = 10; i < 21; i++) {
            if(i % 2==0){
                continue; // bunu yapinca even num skip yapiyo ve sadece odd num veriyor
            }
            System.out.println(i);

        }
        System.out.println("-----------------------------------");

        for (char i ='A';i<='G';i++){
            if (i== 'B' || i=='E')// bu da olur asagida ki de b ve e yi skip yapicak
                continue;
          /*  if (i=='E')
                continue;*/

            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");// bu on defa tekrarlar eger curly braces koymazsan bir altinda yazdigin sadece bir kere cikar
        }// mesela}
          //  System.out.println("Cydeo");//  boyle iki curly brace arasida iki tane olunca sirasiyla bi o bi o cikariyor


        int n=5;
        int result = 1;
        for (int i = 1; i <= n ; i ++){
            result *= n ;
            System.out.print(result);
        }

    }



    }

