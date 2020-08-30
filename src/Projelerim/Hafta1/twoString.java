import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */

        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        if

        (str1.endsWith(String.valueOf(str2.charAt(0)))){
            System.out.print(str1 + str2.substring(1));

        }
        else{
            System.out.print(str1 + str2);
        }

    }
}
