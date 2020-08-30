import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */


         //      kodu burdan başlatın
        Scanner oku=new Scanner(System.in);


        int sayi=oku.nextInt();

        int i=1;
        int fak=1;

        while (i<=sayi){
            fak=fak*i;


            i++;
        }
        System.out.println(fak);



    }
}
