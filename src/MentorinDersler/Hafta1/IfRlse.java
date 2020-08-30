package MentorinDersler.Hafta1;

import java.util.Scanner;

public class IfRlse {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.print("kelime giriniz = ");
        String text=sc.nextLine();

        if(text.contains("y")) {
            String yeni = text.substring(text.indexOf("y")).toUpperCase();
            System.out.println(" yeni string");
            System.out.println(" eskii string");
        }else   System.out.println("girdiginiz stringde y karekteri yok");























    }








}
