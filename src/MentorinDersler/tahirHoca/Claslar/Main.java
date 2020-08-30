package MentorinDersler.tahirHoca.Claslar;

public class Main {

    //Stringin son karakterini veren metod yaziyotuz.
    public char  lastCharacter(String str){
        return str.charAt(str.length()-1);
    }
    //Arrayin max elemaninin bulma metodu yazalim ve test edelim

    public int maxNumberArray(int [] arr){
        int max=0;

        for (int i = 0; i <arr.length ; i++) {

            if (max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }

    // faktoriyel bulma metodu yazalim ve test edelim.

    public  int factorial(int num) {



        int faktoriyel=1;

        while(num>0){
            faktoriyel=faktoriyel*num;
            num--;
        }
        return faktoriyel;
    }

}
