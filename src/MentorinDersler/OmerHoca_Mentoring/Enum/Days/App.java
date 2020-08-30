package MentorinDersler.OmerHoca_Mentoring.Enum.Days;

public class App {
    /*
    days isminde enum class oluşturun ve haftanın günlerini yazınız.
    Months isminde enum class oluşturun ve ayları yazınız. Parametre olarak ta kaçıncı ay oldugunu yazınız. örn: OCAK(1)

    1-)main class ta ise günlerden salıyı seçip yazdırınız.

    2-)  Herhangi bir ayı seçip konsola şunu yazdırınız:

    Nisan yılın 4. ayıdır.
     */
    public static void main(String[] args) {

       Gunler gun=Gunler.Sali;
        System.out.println("gun = " + gun);

        Aylar ay=Aylar.AGUSTOS;
        System.out.println(ay+ " yilin "+ay.getAylar()+ " .ayidir");
    }
}
