package MentorinDersler.Hafta6.example;

public class ogretmen {
    //isim, bolum ve deneyim instance variable (degiskenlerini) iceren bir Ogretmen class i olusturunuz.
    //ogretmenimNasil adli bir method icinde deneyim yilina gore ogretmenin kalitesini olcun.

    String name;
    String bolum;
    int deneyim;
    String ogretmenimNasil(){

        if (deneyim<2){
            return "idare eder";
        }else if (deneyim>=2 && deneyim<4){
            return "daha iyisi olabilirdi";
        }else if (deneyim>=4){
            return "daha neolsun , cok iyi ";
        }
        return "";
    }

}
