package REPL_IT.Array;

import java.util.Arrays;

public class ArraySoru9 {
    public static void main(String[] args) {
    /*    int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30

    Arraydaki en büyük 2. elemanı yazdıran bir program yazın.*/


        int[] arr = {15, 25, 22, 18, 30};

//        Arrays.sort(arr);
//
//            System.out.println(arr[arr.length-1]);

        int max = arr[0];
        int max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {      // max=9      max2=8      arr[0]  = 13
            if (arr[i] > max){
                max2 = max;
                max = arr[i];
            }else if (arr[i] > max2)
                max2 = arr[i];

        }
        System.out.println(max2);

    }}



