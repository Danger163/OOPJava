package rpis81.polotnyanshikov.oop;

import rpis81.polotnyanshikov.oop.model.DebitAccount;
import rpis81.polotnyanshikov.oop.model.AccountManager;
import rpis81.polotnyanshikov.oop.model.Individual;

public class Test {
    public static void main (String[] args) {
        System.out.println("Я сделяль!");
        lab1tests();
    }

    public static void lab1tests(){
        DebitAccount[] accounts=new DebitAccount[3];
        accounts[0]=new DebitAccount();
        accounts[1]=new DebitAccount("464568",5266.01);
        accounts[2]=new DebitAccount("554589",165489.68);
        System.out.println("Вывод до изменений");
        for (DebitAccount account:  accounts) {
            System.out.format("Номер счета: %s \nТекущий баланс: %s\n\n",account.getNumber(),account.getBalance());
        }

        accounts[0].setNumber("558956");
        accounts[1].setBalance(55635.12);
        accounts[2].setBalance(accounts[2].getBalance()-100000);

        System.out.println("Вывод после изменений");
        for (DebitAccount account:  accounts) {
            System.out.format("Номер счета: %s \nТекущий баланс: %s\n\n",account.getNumber(),account.getBalance());

        }
        Individual[] individuals=new Individual[3];
        individuals[0]=new Individual();
        individuals[1]=new Individual(3);
        individuals[2]=new Individual(accounts);

        for (DebitAccount account:  individuals[2].getAccounts()) {
            System.out.format("Номер счета: %s \nТекущий баланс: %s\n\n",account.getNumber(),account.getBalance());

        }
        individuals[2].add(new DebitAccount("565659",56.0));
        individuals[2].add(9,new DebitAccount("565656",56.0));
        individuals[2].add(10,new DebitAccount("565656",56.0));
        individuals[2].add(new DebitAccount("565658",56.0));
        individuals[2].remove(10);
        individuals[2].remove("565658");
        for (DebitAccount account:  individuals[2].sortedAccountsByBalance()) {
            System.out.format("Номер счета: %s \nТекущий баланс: %s\n\n",account.getNumber(),account.getBalance());

        }
        System.out.format("Суммарный счет: %s\n",individuals[2].totalBalance());

        AccountManager[] accountManagers=new AccountManager[2];
        accountManagers[0]=new AccountManager(13);
        accountManagers[1]=new AccountManager(individuals);

        for (DebitAccount account:  accountManagers[1].get(2).getAccounts()) {
            System.out.format("Номер счета: %s \nТекущий баланс: %s\n\n",account.getNumber(),account.getBalance());

        }
    }

    public static void lab2tests()
    {

    }

    public static void lab3tests(){

    }
}
