package ödevler;

import javax.swing.*;
import java.util.Scanner;

public class odevIfElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("noktanin x eksenindeki degeri giriniz");
        int x =sc.nextInt();

        System.out.print("noktanin y eksenindeki degeri giriniz");
        int y =sc.nextInt();

        if((x>-2 && x<8) && (y>1 && y<4))
            System.out.println("icinde");
        else if((x>=-2 && x<=8) && (y>=1 && y<=4 ))
            System.out.println("ustunde");
        else
            System.out.println("disinda");







    }
}
