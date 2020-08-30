package MentorinDersler.Hafta3;

import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {
        // konsola maximum ve minimum degeri saglayiniz.ve buradan gelen rakamlari Math.random() da olmasini istedigin araliga getirin

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen minimum icin bir deger girin");
        int min=sc.nextInt();
        System.out.println("Lütfen maximum icin bir deger girin");
        int max=sc.nextInt();

        int numberinRange= (int) (Math.random()* ((max - min) +1)) +min;

        System.out.println("random rakam = " + numberinRange);

    }
}
