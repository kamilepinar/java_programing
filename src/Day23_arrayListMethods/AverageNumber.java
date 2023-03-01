package Day23_arrayListMethods;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);//add method add element. we can do it with array list size is dynamic cunku
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);//to find last index numver we substract 1

        System.out.println(list);

        // to find the avg number you need to find the sum first, we use get method to get every element index number and you for loop too
        int sum = 0;

        //for each loop is easer way to find everyelement
        for (Integer each :list) {
            sum+=each;// after we get each element we can add the sum

        }
        //avg num usualy decimal soo double

        double average = sum /(double)list.size();// as long as one of them is decimal you will  have exact decimal num


        System.out.println("The avarage numbver is: " + average);







    }
}
