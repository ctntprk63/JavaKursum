package Projelerim.Hafta3;

public class soru4 {
    public static void main(String[] args) {
       /* Soru 4:
        ThreeEvenOdd
        threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
        gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
        false göndersin.

                Örnek:

        intArray([2, 1, 3, 5]) sonuc  true olmalı
        intArray([2, 1, 2, 5]) sonuc   false olmalı
        intArray([2, 4, 2, 5]) sonuc   true olmalı*/
        System.out.println(threeEvenOrOdd(new int[]{2,4,5}));
    }

    public static boolean threeEvenOrOdd(int[] Array)
    {
        int tek=0;
        int cift=0;

        for (int i = 0; i <Array.length ; i++) {
            if(Array[i]%2==1)
                tek++;
            else cift++;
        }

        if(tek==3|| cift==3)
            return true;
        else
            return false;


    }
}
