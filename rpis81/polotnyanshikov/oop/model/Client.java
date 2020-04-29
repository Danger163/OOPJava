package rpis81.polotnyanshikov.oop.model;

public interface Client {
    public boolean add(Account account);
    public boolean add(int index, Account account);
    public Account get(int index);
    public Account get(String accountNumber);
    public boolean hasAccount(String accountNumber);
    public  Account set(int index,Account account);
    public Account remove(int index);
    public Account remove(String accountNumber);
    public int size();
    public Account[] getAccounts();
    public Account[] sortedAccountsByBalance();
    public double totalBalance();
    public String getName();
    public void setName(String name);
}
