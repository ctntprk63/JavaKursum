package MentorinDersler.OmerHoca_Mentoring.Enum.KahveDukkani;

public enum tatlilar {

    CİLEKLİPASTA(4),
    MOZAİKPASTA(3.5),
    MUZLUPASTA(4.5),
    ;

    private final double ucret;

    tatlilar(double ucret) {
        this.ucret = ucret;
    }

    public double getUcret() {
        return ucret;
    }







}
