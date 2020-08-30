package MentorinDersler.Hafta4;

import java.util.ArrayList;
import java.util.Collections;

public class Soru1 {
    public static void main(String[] args) {
        /*

String arrayList oluşturun.

İçerisine Almanya, Italya , Türkiye , Yunanistan , Kanada ekleyin.

reverse   adında  void bir method oluşturun ve parametresi   String arrayList olsun.

Bu method, arrayListteki değerleri tersten sıralasın ve yazdırsın.

methodu çağırın.

Konsoldaki görüntü böyle olmalı:


ilk hali :   [Almanya, İtalya, Türkiye, Yunanistan, Kanada]
Tersten hali :   [Kanada, Yunanistan, Türkiye, İtalya, Almanya]

 */
        ArrayList<String > ulkeler=new ArrayList<>();

        ulkeler.add("Almanya");
        ulkeler.add("Italya");
        ulkeler.add("Yunanistan");
        ulkeler.add("kanada");
        ulkeler.add("turkiye");

        reverse(ulkeler);

    }
    public static void reverse(ArrayList<String>ulkeler){

        Collections.reverse(ulkeler);
        System.out.println(ulkeler);
    }
}
