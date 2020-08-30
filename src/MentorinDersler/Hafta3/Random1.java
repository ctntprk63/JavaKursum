package MentorinDersler.Hafta3;

import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {
       // iki tane zarin toplami 9 ise kazandiniz, degilse kazanmadiniz yazdirin.

        int min=1;
        int max=6;
        int ilkatis=(int) (Math.random()* ((max - min) +1)) +min;
        int ikinciatis=(int) (Math.random()* ((max - min) +1)) +min;
        int toplam =ilkatis+ikinciatis;
        System.out.println( ilkatis + " + " + ikinciatis + " = " + toplam);

        if (toplam == 9){
            System.out.println("kazandiniz");
        }else {
            System.out.println("Tekrar deneyiniz");
        }



    }
}
