package MentorinDersler.Hafta6.example;

public class Anasinif {
    public static void main(String[] args) {

        sinif sin= new sinif();
        sin.konu= "java";


        sin.ogr=new ogrenci();
        sin.ogr.name="ali";
        sin.ogr.bolum="bilgisayar";
        sin.ogr.yas=25;
        sin.ogr.birinciSinav=75;
        sin.ogr.ikinciSinav=87;
        sin.ogr.ucuncuSinav=89;

        sin.ortmen=new ogretmen();
        sin.ortmen.name="ayse";
        sin.ortmen.bolum="programci";


    }
}
