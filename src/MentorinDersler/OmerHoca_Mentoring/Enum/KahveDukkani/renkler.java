package MentorinDersler.OmerHoca_Mentoring.Enum.KahveDukkani;

public enum renkler {
    /*
Enum renkler oluşturun. (main class i ile aynı classta olsun.)
Trafik lambası mantığı ile hareket edin. Her rengin parametresi olarak kuralını yazın. örn: KIRMIZI("DUR")   (KIRMIZI , SARI , YEŞİL için)

main methodunun içerisinde bu değerleri parametreleri ile beraber yazdırın. (       todo ipucu:  array a atayın     -    foreach)

Konsol böyle olmalı:

Renk : KIRMIZI    kural: DUR
Renk : SARI    kural: HAZIR OL
Renk : YESİL    kural: GEÇ
 */

    kirmizi("Dur"),
    Sari("Hazir ol"),
    Yesil("Gec");

    private String kural;

    renkler(String  kural) {
        this.kural=kural;
    }
    public String getKural(){
        return this.kural;
    }





    public static void main(String[] args) {

        renkler [] tumRenkler=renkler.values();

        for (renkler renkleriYazdir:tumRenkler) {

            System.out.println("Renk : "+ renkleriYazdir.name()+"kural : "+ renkleriYazdir.getKural());

        }
    }
}
