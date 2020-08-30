import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {

    /*
     Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();

        int max = scanner.nextInt();

        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("numberInRange = " + numberInRange);


    }
}
