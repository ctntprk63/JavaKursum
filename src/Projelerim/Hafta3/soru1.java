package Projelerim.Hafta3;

public class soru1 {

        public static void main(String[] args) {
//        Soru 1:
//        CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
//        büyük harfe çevirip geri döndüren metodun yazınız.
//
//                Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

            String str="bugün hava cok güzel";



            for (int i = 0; i <camelcase(str).length; i++) { /** camelcase(str) bizim dizimiz..*/

                System.out.print(camelcase(str)[i]+" ");
            }

        }


    public static String[] camelcase(String str) {

        String[] kelimeler = str.split(" ");


        for (int i = 0; i < kelimeler.length; i++) {

            String BuyukHarf = kelimeler[i].substring(0, 1).toUpperCase();
            kelimeler[i] = BuyukHarf.concat(kelimeler[i].substring(1));

        }

        return  kelimeler;

    }

}




