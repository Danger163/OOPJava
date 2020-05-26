package rpis81.polotnyanshikov.oop.model;

import java.time.LocalDate;

public interface Credit {

    public double getAnnualPercentageRate();

    public void setAnnualPercentageRate(double AnnualPercentageRate);
    public double nextPayment();
    public LocalDate nextPaymentDate();


}