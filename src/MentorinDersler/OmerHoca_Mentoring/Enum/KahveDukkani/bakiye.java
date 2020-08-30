package MentorinDersler.OmerHoca_Mentoring.Enum.KahveDukkani;

public enum bakiye {

    musteri1(10);

    private  double bakiyem;


    bakiye(double bakiyem) {
        this.bakiyem = bakiyem;

    }

    public double getBakiyem() {
        return bakiyem;
    }
}
