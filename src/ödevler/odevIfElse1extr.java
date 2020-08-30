package ödevler;

import java.util.Scanner;

public class odevIfElse1extr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("noktanin x eksenindeki degeri giriniz= ");
        int x =sc.nextInt();

        System.out.print("noktanin y eksenindeki degeri giriniz = ");
        int y =sc.nextInt();

        if((x>-2 && x<8) && (y<4 && y>1) || (x>=-2 && x<=8) && (y<=4 && y>=1))
            System.out.println("icerde");
        else
            System.out.println("disinda");
















    }
}
