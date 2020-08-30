import java.util.Random;
import java.util.Scanner;

public class RandomNum {
     /*

    Kullanıcıdan pozitif bir sayı alınız ve
    0 ile girilen sayı arasında Random int tipinde bir sayı üreten programı yazınız.

    not : girilen sayı üretilen sayılara dahil olmalı

  */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int girilenSayi= scan.nextInt();

        int random = (int) (Math.random() * girilenSayi+1);
        System.out.println(random);

    }
}