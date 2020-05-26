package rpis81.polotnyanshikov.oop.model;

import java.time.LocalDate;

public interface Account {
    String number="";
    double balance = 0;

    public String getNumber();

    public void setNumber(String number);

    public double getBalance();
    public void setBalance(double balance);
    public LocalDate getCreationDate();
    public LocalDate getExpirationDate();
    public void setExpirationDate(LocalDate expirationDate);
    public int monthesQuantityBeforeExpiration();
}
