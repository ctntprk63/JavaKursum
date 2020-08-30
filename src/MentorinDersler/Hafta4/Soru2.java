package MentorinDersler.Hafta4;

import java.util.ArrayList;
import java.util.Collections;

public class Soru2 {
    public static void main(String[] args) {
        /*
Integer ArrayList  a   oluşturun. 10 elemanlı olsun

randomEkle diye bir void method oluşturun.

Bu method, ArrayList'e 0 ile 100 arasında random değerler atasın.

20'den küçük olan elemanları yazdırınız.

20'den küçük eleman yoksa, '20'den küçük eleman yoktur'. yazdırınız.
 */


        ArrayList<Integer>sayi=new ArrayList<>();

        randomEkle(sayi);

    }
    public static void randomEkle(ArrayList<Integer>r){
int count=0;
        for (int i = 0; i < 10; i++) {
            r.add((int)(Math.random()*100+1));

            if (r.get(i)<20){
                System.out.println("20 den kucuk olanlar ; "+r.get(i));
                count++;
            }
        }

        Collections.sort(r);
        if (count==0){
            System.out.println("20 den buxuk olanlar");
        }
        System.out.println();
        System.out.println("ArrayList sayi : " + r);
    }
}
