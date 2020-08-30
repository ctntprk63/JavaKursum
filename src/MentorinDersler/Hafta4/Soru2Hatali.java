package MentorinDersler.Hafta4;

import java.util.ArrayList;

public class Soru2Hatali {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        randomEkle(a);

    }


    public static void randomEkle(ArrayList<Integer> r) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            r.add((int) (Math.random() * 100 + 1));

            if (r.get(i) < 20) {
                System.out.println("20 den küçük olanlar : " + r.get(i));
            } else
                System.out.println("20 den küçük sayı yoktur..");
        }
        System.out.println(r);

    }
    }

