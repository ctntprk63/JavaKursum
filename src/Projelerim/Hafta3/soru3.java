package Projelerim.Hafta3;

public class soru3 {
    public static void main(String[] args) {
//        Soru 3:
//        SubtractionSquare:
//        getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
//        toplayıp çıkan sonucun karesini döndüren bir metod yazınız.
//
//        substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.
//
//                main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
//        getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
//        main metodundan yazdırınız.
//
//                Örnek:
//
//        int 1 = 10;              yazacağınız method 10 u kullanarak 3250 sonucu verir
//
//        int 2 = 5;                yazacağınız method 5 i kullanarak 225 sonucu verir
//
//        3025 + 225 = 3250
//
//        return 3250
        System.out.println("xxxxxxxxxxxxxxx");

        //not
      /*  main()
        {
            substSquare(5,10);
        }

        substSquare(int a, int b)
        {
            getSumOfSquares(a);
            getSumOfSquares(b);

            return int;
        }

        getSumOfSquares(int a)
        {

            return int;*/


        int girilenSayi1=5;
        int girilenSayi2=10;

        System.out.println(substSquare(girilenSayi1,girilenSayi2));


    }





    public static int getSumOfSquares (int sayi){

        int toplam =0;
        for (int i = 1; i <=sayi ; i++) {
            toplam=toplam+i;



        }
        int toplamKare=toplam*toplam;
        return toplamKare;
    }
    public static int substSquare (int sayi1,int sayi2){


        return (getSumOfSquares(sayi1)+getSumOfSquares(sayi2));


    }


}



