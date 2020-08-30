package REPL_IT.Array;

public class Array10 {
    public static void main(String[] args) {

     /*   Bir String oluşturun : "Hello World"

        Stringi tersten yazdırın ve print edin.

        Cevap böyle olmalı :  "dlroW olleH"

*/
        String kelime=" Hello World";
        String reverse=" ";
        for (int i =kelime.length()-1;i>=0; i--) {
            reverse=reverse+kelime.charAt(i);



        }
        System.out.println(reverse);




    }
}
