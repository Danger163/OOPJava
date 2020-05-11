package rpis81.polotnyanshikov.oop.model;

public class DebitAccount extends AbstractAccount {
    String number;
    double balance;



    public DebitAccount()
    {
        super();
    }

    public DebitAccount(String number, double balance)
    {
        super(number, balance);
    }
}
