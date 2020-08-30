package REPL_IT.Array;

import java.util.Arrays;

public class ArraySoru7 {
    public static void main(String[] args) {
       /* int Array oluşturun ve elemanları : 12,2,5,15,8
        En büyük değeri yazdırınız.*/

        int [] dizi={12,2,5,15,8};




       int max = dizi[0];

        for (int i = 0; i < dizi.length; i++){
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }

        System.out.println( max);




    }
}
