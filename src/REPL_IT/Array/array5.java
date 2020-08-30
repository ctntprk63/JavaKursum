package REPL_IT.Array;

import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        //    int Array oluşturun ve elemanları : 5,6,8,12,14,19  Eğer sayı çiftse topla, tekse çıkar.

        //       Örneğin:  -5 + 6 + 8 + 12 + 14 - 19 = 16  Toplamlarını yazdırın.

        int[] dizi = {-5 + 6 + 8 + 12 + 14 - 19};
        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) { //Ben burada çift sayıları kontrol ettim. 0'ı 1 yaparsanız tek sayıları kontrol edersiniz.
                System.out.print(dizi[i]);



            }



        }


    }}