package MentorinDersler.Hafta2;

public class IndexOf {
    public static void main(String[] args) {


        String str="aaacabaaab";
        System.out.println(str.indexOf('a'));


        System.out.println("ikinci a nin indexi = " + str.indexOf('a', 1));

        System.out.println("ucuncu a  = " + str.indexOf('a',8));// 8. karakterden sonraki a yi veriyor.


        String s ="Benim ismim Tahir";
        String b="Benim ismym Tahir";
        System.out.println(s.replace((char) b.indexOf("i",8 ), 'y'));








    }
}
