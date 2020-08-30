package REPL_IT.CollectionsArrayList;

public class Arrays12 {
    public static void main(String[] args) {
        int [] dizi={1,2,3,4,5,6,7,8,2};
        System.out.println(dupicate(dizi));
    }
    public static boolean dupicate(int[] dizi){
        boolean ciftleme=false;
        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j]) ciftleme=true;
            }
        }
        return  ciftleme;
    }


}

  /*  duplicate() isminde bir method oluşturun.
        Parametresi int Array olmalı
        Return tipi boolean
        Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
        Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
        Örnek1:
        Input: [1,2,3,1]
        Output: true
        Örnek 2:
        Input: [1,2,3,4]
        Output: false*/