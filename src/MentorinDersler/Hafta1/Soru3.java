package MentorinDersler.Hafta1;

import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print(" yasinizi giriniz = ");

        int yas = sc.nextInt();
        if (yas >= 18) {
            System.out.println("sigara satin alabilirsin");

        } else
            System.out.println("Sigara alamaya yetmiyor");


        System.out.println("------------------------------------------------");




        System.out.print("sayi gir = ");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("cift sayi" + "kalan->>"+(num%2) );
        }else
            System.out.println("tek sayi" + "kalan--->"+ num%1);





















    }











    }



