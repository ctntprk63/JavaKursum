package MentorinDersler.OmerHoca_Mentoring.Enum.KahveDukkani;

public enum icecekler {
    TURKKAHVESİ(3),
    ESPRESSO(4.5),
    GAZOZ(2.55) ,
    LİMONATA(2);

    private double ucret;


    icecekler(double ucret) {
        this.ucret = ucret;

    }

    public double getUcret() {
        return ucret;
    }
}
