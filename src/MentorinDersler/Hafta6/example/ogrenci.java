package MentorinDersler.Hafta6.example;

public class ogrenci {
    //isim, bolum, yas, birinciSinav, ikinciSinav ve ucuncuSinav instance variable
    // (degiskenlerini) iceren bir Ogrenci class i olusturunuz
    //ogrencinin not ortalamasini hesaplayacak bir method olusturunuz.


    String name;
    String bolum;
    int yas;
    int birinciSinav;
    int ikinciSinav;
    int ucuncuSinav;

    int notOrtalamasi(){
        return (birinciSinav+ikinciSinav+ucuncuSinav)/3;

    }


}

