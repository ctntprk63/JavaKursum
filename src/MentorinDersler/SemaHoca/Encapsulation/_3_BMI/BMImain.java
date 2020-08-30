package MentorinDersler.SemaHoca.Encapsulation._3_BMI;

public class BMImain {
    public static void main(String[] args) {

        BMI bm1=new BMI("alice", 18,80,1.60);
        System.out.println("BMI: "+ bm1.getName()+" "+bm1.getStatus()+" "+bm1.getBMI());


    }
}
