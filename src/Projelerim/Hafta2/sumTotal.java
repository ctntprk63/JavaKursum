package Projelerim.Hafta2;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        String [][] para={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        int toplamdolar=0;
        int toplameuro=0;
        int sontoplam=0;
        for (int i=0; i<para.length;i++) {
            for (int j = 0; j < para[i].length; j++)
                if (para[i][j].contains("$"))
                    toplamdolar = (int) (toplamdolar + (Integer.parseInt(para[i][j].replaceAll("[^-0-9]", ""))) * 3.2);
                else
                    toplameuro = (int) (toplameuro + (Integer.parseInt(para[i][j].replaceAll("[^-0-9]", ""))) * 4.2);
        }
        sontoplam=toplamdolar+toplameuro;

        System.out.println(sontoplam);

    }
}



