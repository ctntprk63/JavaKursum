package REPL_IT.CollectionsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays8 {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist=new ArrayList<>(List.of(5,3,40,6,70));
        System.out.println(secondMax(arraylist));
    }
    public static int secondMax(ArrayList<Integer> arraylist)
    {
        Collections.sort(arraylist);
        return  arraylist.get(arraylist.size()-2);
    }


}







/*

    secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.  ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;   ArrayList   --  5,3,4,6,7
        CEVAP : 6 */
