package MentorinDersler.Hafta5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap1 {
    public static void main(String[] args) {

        //ToDo 5 tane ulke ismi ve nufusunu yazıyorsunuz
        LinkedHashMap<String ,Integer> country=new LinkedHashMap<>();

        country.put("Deutschland",  85000000);
        country.put("Turkei ",      88000000);
        country.put("ABD ",        250000000);
        country.put("Greecland",   30000000);
        country.put("Irac",        40000000);
        System.out.println("country = " + country);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println(country.keySet());
        System.out.println(country.values());


        //Todo nufuslarin toplami

        int toplam =0;
        for (Map.Entry<String,Integer> nufus : country.entrySet() ) {

            toplam+=nufus.getValue();

        }
        System.out.println("Toplam : " + toplam );

        //Todo kac tane 50 milyondan az nufuslu ulke var

        int sum =0;
        for (Integer nufus :country.values()){
            if (nufus<50000000)
                sum++;




            }
        System.out.println("sum = " + sum);
        }


        }

    


   
   




