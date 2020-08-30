import java.util.Scanner;

public class getTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();


        //   int sayi1 = Integer.parseInt(str2.substring(1));
        //    int sayi2 = Integer.parseInt(str2.substring(1));
        // int sayi3 = Integer.parseInt(str3.substring(1));

        int sayi1 = Integer.parseInt(str1.replaceAll("[^-0-9]",""));
        int sayi2 = Integer.parseInt(str2.replaceAll("[^-0-9]",""));
        int sayi3 = Integer.parseInt(str3.replaceAll("[^-0-9]",""));

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);


        int toplam = sayi1 + sayi2 + sayi3;


        if (toplam > 0) {
            System.out.println(toplam);

        }
        else if(toplam<0)
            System.out.println(-1);

    }
}



