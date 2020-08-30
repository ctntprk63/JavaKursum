package REPL_IT.Array;

public class Array15 {
    public static void main(String[] args) {
        /*Bu String'i oluşturun. "Removes white space from both ends of a string"  ...String'deki kelime sayısını yazdırınız.
*/


        String kelime="Removes white space from both ends of a string";
        int sayi=0;
        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)==' ') sayi++;  // NBOSLUK SAYISINI bulup +1 ekliyoruz.

        }

        System.out.println(sayi+1);


    }
}
