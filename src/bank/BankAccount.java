package bank;
import java.util.List;
import java.util.ArrayList;


public class BankAccount {
//банківський рахунок
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
            System.out.println("Помилка: сума має бути більшою за 0");
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




}
}

//List printTransactions(){};
//}
