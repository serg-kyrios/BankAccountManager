package bank;

import java.util.List;
import java.util.ArrayList;

public class BankAccount {

    String ownerName;
    double balance;
    List<Transaction> transactions;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {

            //System.out.println("Помилка: сума має бути більшою за 0");
            System.out.println("Поповнення на: " + amount + " грн! 🎉");

           // System.out.println("Помилка: сума має бути більшою за 0");
            System.out.println("Рахунок поповнено на: " + amount + " грн!");


            return;
        }

        balance += amount;
        transactions.add(new Transaction(amount, TransactionType.DEPOSIT));

        System.out.println("Поповнення на: " + amount);
        System.out.println("Баланс: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Помилка: сума має бути більшою за 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Помилка: недостатньо коштів на рахунку");
            return;
        }

        balance -= amount;
        transactions.add(new Transaction(amount, TransactionType.WITHDRAW));

        System.out.println("Зняття на: " + amount);
        System.out.println("Баланс: " + balance);
    }

    public void printTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("Транзакцій поки немає");
            return;
        }

        System.out.println("Історія транзакцій:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }
}




