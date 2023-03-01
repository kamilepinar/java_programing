package Day22_arrayList;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args){
        //index of 1D array //    0             1             2
        int [] [] array = { {100,20,300},{10,1000,50},{-200,400,0}};
        //index of elements   0   1  2     0   1   2    0    1  2

        int max = array[0][0];//bu assumption yaptik en kucuk elementi icine girdik en bastakini yazdik
        int min =array [0][0];//


        for(int[] each1D:array){
            //for to iterate each element from the array
            for (int eachElement :each1D){
                if(eachElement > max){ //if method ile en kucuk elementi assumption ile karsilastiriyoruz
                    max = eachElement; // en buyuk numarayi assign  yaptik boylee

                }

                if (eachElement < min){
                    min = eachElement; // buda min num bulmak icin/ ikisi de indipendent if block olmak zorunda else blockla olmaz
                }
            }

        }


        System.out.println("Maximum number is : " +max);
        System.out.println("Minumum number is: " + min);



    }
}
