package REPL_IT.Array;

public class Array11 {
    public static void main(String[] args) {

/*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4

        Array'in ortalamasını alınız.*/


            int [] arr={ 12, 14 , 21 ,23 , 10 ,4};
            int toplam=0;
            for (int i:arr){
                toplam = toplam+i;

            }



        int ortalama=toplam/arr.length;
        System.out.println("ortalama = " + ortalama);

















    }

}
