package REPL_IT.Array;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {

      /*  Girilen 123 Intiger'ının basamaklarını ters çevirin.

        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
*/

        //TODO girdi ile alina sonuc:
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Bir sayi giriniz: ");
//        int sayi = scan.nextInt();
//
//        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
//        while(sayi > 0) {
//
//            System.out.print(sayi % 10);
//            sayi /= 10;
//        }
        //TODO 2. yöntem

        int sayi=123;
        while (sayi>0){
            System.out.print(sayi%10);
            sayi=sayi/10;

        }



    }
}
