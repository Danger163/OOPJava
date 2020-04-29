package rpis81.polotnyanshikov.oop.model;

public class DebitAccount implements Account {
    String number;
    double balance;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number=number;
    }

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public DebitAccount()
    {
        number="";
        balance=0.0;
    }

    public DebitAccount(String number, double balance)
    {
        this.number=number;
        this.balance=balance;
    }
}
