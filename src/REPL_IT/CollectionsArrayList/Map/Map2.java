package REPL_IT.CollectionsArrayList.Map;

import java.util.Map;

public class Map2 {
    public static void main(String[] args) {



    }
    public static String map1(Map<Integer,String> mp, int num){
        String str="";
        for (Map.Entry<Integer,String> ts:mp.entrySet()) {
            if(ts.getKey()==num) str=ts.getValue();
        }
        return str;
    }
    }








   /* returnKey() isminde bir method oluşturun.
        Parametresi     String-Integer HashMap olsun.
        Return tipi Array List olsun.
        Hashmap:
        1,  "Lion"
        2 ,  "Tiger"
        3 ,  "Elephant"
        4 ,  "Cat"
        5  , "Dog"
        Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
*/