import java.util.Scanner;

public class totalLetterCountCheck {

    /*
      Girilen bir string teki harf sayısı tek ise true , değilse false yazdırınız.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        if (word.length()%2==0)
            System.out.println("false");
        else
            System.out.println("true");
    }
}
