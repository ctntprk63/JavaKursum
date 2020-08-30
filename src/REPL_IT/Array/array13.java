package REPL_IT.Array;

import java.util.Arrays;

public class array13 {
    public static void main(String[] args) {
       /* Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması için yeniden düzenlenmiş
        bir Array döndürün.   Sıfır olmayan sayıların sırası önemli değildir.

                Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.


        Bu şekilde bir Array oluşturunuz: 1,0,0,1,0  Sonuç böyle olmalı :  0,0,0,1,1*/
        int [] array={1,0,0,1,0};
        Arrays.sort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }









    }
}
