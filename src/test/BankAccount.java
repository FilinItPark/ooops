package test;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        /*
        инкапсуляция - механизм языка связывающий данные и функции для работы с этими данными
         */
        /*
        полиморфизм - механизм языка позволяющий функции работать с разными данными
        1) параметрический, sum(2,3), sum(2,3,5)
        2) перегрузки (@Override)
        3) Generic/обобщенный вариант
         */
        if (balance >= 0) this.balance = balance;
        else System.out.println("дурак, баланс не может быть отрицательным");
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Balance=" + balance;
    }

    @Override
    public boolean equals(Object o) {

        BankAccount account = (BankAccount) o;
        return getBalance() == account.getBalance();
    }

}
