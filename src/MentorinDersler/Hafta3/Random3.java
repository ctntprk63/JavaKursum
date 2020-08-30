package MentorinDersler.Hafta3;

import java.util.Scanner;

public class Random3 {
    public static void main(String[] args) {

        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise sift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

       int min=0;
       int max=20;

       int numberinRange= (int) (Math.random()* ((max - min) +1)) +min;

       if(numberinRange%2 ==0){

           System.out.println("cift sayidir");

       }else
           System.out.println(" tek sayidir");

    }
}
