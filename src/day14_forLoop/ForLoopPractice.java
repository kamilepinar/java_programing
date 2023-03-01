package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {



        for(int i=10; i >=5 ;i--){//10,9,8,7,6,5, burda da 6 defa cikariyor
            // for(int i =5; i<=10; i++) boylede olur 5,6,7,8,9,10 toplamda 6 tane cikarir ikisindede
            System.out.println("Hello Cydeo "+i); //hello cydeo 10gibi cikar consolda
        }


        System.out.println("------------------------------------");

        int sum =0;
        for(int i =1; i <=100; i ++){
            sum+=i;
           // System.out.println(sum); bunu icine koyunca surekli toplayarak gidiyor
        }
        System.out.println(sum);

        System.out.println("-----------------------------------------------");
        for(char i = 'A';  i <= 'Z'; i++){
            System.out.print(i +" ");
        }

        System.out.println();

        System.out.println("-------------------------------------------------");

        // print all the alphabet letters in backwards Z ~ A

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print( i +" ");
        }


        System.out.println();

        System.out.println("Cydeo");


        for(char i = 'A'; i <= 'Z';i++ ){
            System.out.print(i+"");
        }
        System.out.println();

        for(char j ='z'; j >= 'a'; j--){
            System.out.print(j+"");
        }




    }
}
