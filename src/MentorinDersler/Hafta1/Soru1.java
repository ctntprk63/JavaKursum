package MentorinDersler.Hafta1;

import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {

        // 2 tane int olustur, iki inti topla sonucu yazdir

        Scanner sc=new Scanner(System.in);
        System.out.println(" Birinci sayi = " );
        int sayi1= sc.nextInt();


        System.out.println(" ikinci sayi = ");

        int sayi2= sc.nextInt();

        int toplam= sayi1+sayi2;

        System.out.println(toplam);


    }
}
