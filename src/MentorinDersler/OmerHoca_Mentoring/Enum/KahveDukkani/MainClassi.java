package MentorinDersler.OmerHoca_Mentoring.Enum.KahveDukkani;

public class MainClassi {
    /*
todo  enum 1.
"bakiye" isminde ayrı bir class oluşturun.
Elemanın ismi Musteri1 olsun ve parametresi 10 olsun. ---> Musteri1(bakiyem:10); (bakiyem double cinsinden olmalı.) bakiyem 10 euro
todo  enum  2.
Ayrı bi enum class açın ve ismi Tatlilar olsun ve parametresi tatliFiyati olsun.
Elemanları  CİLEKLİPASTA ve fiyatı 4 ,              MOZAİKPASTA ve fiyatı 3.5,               MUZLUPASTA ve fiyatı 4.5 olsun.

todo enum 3.

Ayrı bir classta icecekler isminde enum class açın ve parametresi fiyat olsun.

TURKKAHVESİ     3
ESPRESSO            4.5                                             euro olsun.
GAZOZ                2.25
LİMONATA        2



todo İPUCU !!!                                                Fiyat bilgilerimize main class ımızdan direkt erişilmesini ve değiştirilmesini istemiyoruz. Fiyatlara erişebilmek için methodları kullanın.


todo Main methodun içi:

müsteriyi cagırın.

içecek olarak gazoz alsın.

tatlı olarak cilekli pasta alsın.


todo kosul:

Eğer toplam tutar bakiyemden büyük ise,

bakiyeniz yetersiz... Toplam tutar = 10.50
  Bakiyeniz : 10                                        yazsın. (toplam tutar örnek amaçlı yazıldı)

diğer durumlarda ise
müşteri adım,
siparişlerim,
 toplam tutar
  para üstü
   Yeni bakiyem

                                                                    alt alta  yazsın.


todo KONSOL ÖRNEĞİ ( Eğer toplam tutar bakiyeden büyük ise)

        Musteri1  Bakiyeniz yetersiz.. ---  Toplam tutar:   10.25
         Bakiyeniz : 10

 todo    Diğer durumlarda:
Müşteri no:  Musteri1
Siparişleri :  GAZOZ -CİLEKLİPASTA
 ToplamTutar= 6.25
Paraüstü = 3.75
Yeni bakiyem = 3.75




todo NOT:
2 durumu da görebilmek için sonradan ekstra bir tatlı daha ekleyin ve onun fiyatını toplam tutara ekleyin.

 */
    public static void main(String[] args) {

        bakiye musteriler=bakiye.musteri1;
        icecekler icecekler1=icecekler.ESPRESSO;
        tatlilar tatlilar1=tatlilar.CİLEKLİPASTA;

        double icecek = icecekler1.getUcret();
        double tatli=tatlilar1.getUcret();

        double bakiye= musteriler.getBakiyem();
        double toplamTutar=icecek+tatli;
        double paraUstu=bakiye-toplamTutar;


        if (toplamTutar>musteriler.getBakiyem()){
            System.out.println(musteriler.name()+" Bakiyeniz yetersiz ---  Toplam tutar ="+ toplamTutar);

        }else
            System.out.println("musteri no: "+ musteriler.name()+ "\n Siparisler " + icecekler1+ "-"+tatlilar1+" \n toplam tutar : "+ toplamTutar+ "\n kalan paraniz = "+ paraUstu);

    }
}
