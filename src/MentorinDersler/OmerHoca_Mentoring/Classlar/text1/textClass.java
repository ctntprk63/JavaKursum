package MentorinDersler.OmerHoca_Mentoring.Classlar.text1;

public class textClass {

    String text1="techno study avrupa sinifi";
    String text2="java kursu devam ediyor";

    public  String ilkYarisi(String text){

        int baslangic =0;
        int ortasi=text.length()/2;
        return text.substring(baslangic,ortasi);
    }
}
