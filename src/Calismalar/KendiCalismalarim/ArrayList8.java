package Calismalar.KendiCalismalarim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList8 {
    public static void main(String[] args) {
//        System.out.println(secondMax());
        



    }
    public static int secondMax(ArrayList<Integer> list){


        ArrayList<Integer> arr = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("list = " + list);




        Collections.sort(arr);
            return arr.get(arr.size()-2);


    }

}



/*
secondMax()  isminde bir method oluşturun.

Parametre olarak integer ArrayList.

Return tipi int olmalı.

ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün

ÖRN;
ArrayList   --  5,3,4,6,7
CEVAP : 6

 */