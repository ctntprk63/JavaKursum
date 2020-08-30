package REPL_IT.CollectionsArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arrays7 {
    public static void main(String[] args) {
        ArrayList<Integer> araylist1=new ArrayList<>(List.of(8,7,9,6,7));
        ArrayList<Integer> araylist2=new ArrayList<>(List.of(6,7,12,3,1));
        System.out.println(common_values(araylist1,araylist2));
    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> araylist1, ArrayList<Integer> araylist2){
        araylist1.retainAll(araylist2);
        return araylist1;

        //2.yöntem
       /* public static ArrayList<Integer> common_values(ArrayList<Integer> araylist1, ArrayList<Integer> araylist2){
            ArrayList<Integer> yeni=new ArrayList<>();
            for (int i = 0; i <araylist1.size() ; i++) {
                for (int j = 0; j <araylist2.size(); j++) {
                    if(araylist1.get(i)==araylist2.get(j)) yeni.add(araylist1.get(i));
                }

            }

            return yeni;
        }*/


    }



}


   /* common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
        İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün

        Örneğin;  ArrayList 1:    3 , 2 , 5 , 6    ArrayList 2:     5 , 8 , 9
        return  5 olmalı
        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı*/