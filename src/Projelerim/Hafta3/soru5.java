package Projelerim.Hafta3;

import java.util.Arrays;

public class soru5 {
    public static void main(String[] args) {
      /*  oru 5:
        UpdateRange
        URange isminde bir metod yazınız,
                Bu metod parametre olarak int Array ve 2 adet int almalı.
        Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
        rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

                Örnek:

        int array = 1,6,12,15,22,18,30,16

        int 1 = 10

        int 2 = 20

        sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.*/

        int [] sayi={1,6,12,15,22,18,30,16};

        int ilksayi=10;
        int ikincisayi=20;

        System.out.println(Arrays.toString(Urange(sayi,ilksayi,ikincisayi)));





    }

    public static int[] Urange(int[] arr,int a,int b){

        int[] yeni=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>10 && arr[i]<20)
            {
                yeni[i] = -1;
            }
            else
                yeni[i]=arr[i];

        }

        return yeni;



    }
}
