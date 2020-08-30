package MentorinDersler.Hafta4;

public class metodlar {
    public static void main(String[] args) {



        dersnotu("cetin " ,65 , 55,true);






    }
    public static void dersnotu(String isim, int not, double ortalama, boolean dersDurumu){
        System.out.println("ögrencinin adi : " +isim +"\nögrencinin notu ; " + not + "\nögrencinin ortalamasi : " + ortalama + "\ngecti mi? " + dersDurumu );
    }
}
