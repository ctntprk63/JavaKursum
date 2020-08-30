package ödevler;

import java.util.Scanner;

public class odevIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" x eksenindeki degeri giriniz = ");
        int x = sc.nextInt();

        System.out.print(" y eksenindeki degeri giriniz = ");
        int y =sc.nextInt();

        if (x>0 && y>0 )
            System.out.println(" girdiginiz konum 'A' noktasindadir.");
        if(x<0 && y>0)
            System.out.println(" girdiginiz konum 'B' noktasindadir.");
        if(x<0 &&  y<0)
            System.out.println(" girdiginiz konum 'C' noktasindadir.");
        if(x>0 && y<0)
            System.out.println(" girdiginiz konum 'D' noktasindadir.");
        else
            System.out.println("eksen üzerinde");




















    }
}
