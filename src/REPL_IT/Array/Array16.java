package REPL_IT.Array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array16 {
    public static void main(String[] args) {
     /*   Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"

        $ işaretlerini kaldırın ve sayıları toplayın.

        Sayıların toplamını yazdırın.*/

        String  str = "$12 $23 $10 $2 $5 $2";


        String sayilar=str.replace("$","");

        int sayi=Integer.parseInt(str);

        int toplam = 0;
        for (int i = 0; i <sayilar.length() ; i++) {



            toplam+=sayi;

          
        }


        System.out.println("toplam = " + toplam);
       


        }
   }



//    Abi String sayilar = str.replace("$", ""); ifadesi sadece metinde $ kaldirir. tamam ancak burada String[] sayilarArr = str.split(" "); demen lazim ki arraye ayirabilesin. 
//        Daha sonra for ile elemanlari Integer.parseInt(sayilarArr[i]); ile toplamalisin