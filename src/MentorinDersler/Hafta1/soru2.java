package MentorinDersler.Hafta1;

import java.util.Scanner;

public class soru2 {


    public static void main(String[] args) {
        // 3 adet double olustutun 3 double topa yazdir
        Scanner sc = new Scanner(System.in);

        System.out.print("sayi 1 gir = ");

        double a= sc.nextDouble();
        System.out.print("sayi 2 gir = ");
        double b=sc.nextDouble();
        System.out.print("sayi 3 gir = ");
        double c =sc.nextDouble();

        double toplam= a+b+c;


        System.out.println("toplam sayi = " + toplam);





    }
}
