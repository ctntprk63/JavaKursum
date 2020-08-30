package REPL_IT.Array;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
      /*  Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]

        Bütün 2'leri 6'yla değiştirin.

        Array'i yazdırınız.*/
        int [][] array= {{2,3,2} , {4,1,5} , {7,2,5}};

        String son=Arrays.toString(array);
        String sonHal=son.replaceAll("2","6");

        System.out.println(sonHal);



    }
}
