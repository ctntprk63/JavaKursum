package REPL_IT.Methods;

public class Soru3 {

    public static void main(String[] args) {

reverseString("Javi'yi Sevecegim ");


    }
    public static String reverseString(String str){
        String strRev="";
        for (int i=str.length()-1; i>=0; i--)
            strRev +=str.substring(i, i+1);
        return strRev;

    }
}

/*
    reverseString isminde bir method oluşturun.

        Bu method bir String'i parametre olarak alsın.

        Ve bu method, girilen String'i tersten yazsın.

        Terste yazılmış halini yazdırınız.



        Örn: String = "Java'yı Seviyorum."

        Print: .muroyiveS ıy'avaJ*/

