package MentorinDersler.SemaHoca.Encapsulation._2_Account;

public class AccountMain {
    public static void main(String[] args) {

        Account account1=new Account(11111,"ali","aaaa@gmail",1000);

        System.out.println(account1.getAcc_no()+ " "+account1.getName()+" "+ account1.getEmail()+" "+ account1.getAmount());

    }
}
