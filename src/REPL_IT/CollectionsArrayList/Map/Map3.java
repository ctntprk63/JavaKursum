package REPL_IT.CollectionsArrayList.Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Map3 {


    public static void main(String[] args) {
        HashMap<String,Integer> mp =new HashMap<>();
        mp.put("Lion",1);
        mp.put("Tiger",2);
        mp.put("Elephant",3);
        mp.put("Cat",4);
        mp.put("Dog",5);

        System.out.println(returnValue(mp));

    } public static ArrayList<Integer> returnValue(HashMap<String,Integer> hm){
        ArrayList<Integer> arraylist=new ArrayList<>(hm.values());
        return arraylist;
    }

}


/*
    ismi returnValue() olan bir method oluşturun.

        Parametresi    String-Integer HashMap

        Return tipi ArrayList

        Bir Hashmap oluşturun ve değerleri Integer ve String'lerden oluşmalı.



        Map

        1 ,  "Lion"
        2 ,  "Tiger"
        3 ,  "Elephant"
        4 ,  "Cat"
        5  , "Dog"

        Tüm DEĞERLERİ (values) for döngüsü ile döndürün.*/