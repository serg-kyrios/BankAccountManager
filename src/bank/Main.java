package bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи ім'я власника рахунку: ");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);

        boolean running = true;

        while (running) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Поповнити рахунок");
            System.out.println("2. Зняти кошти");
            System.out.println("3. Показати баланс");
            System.out.println("4. Історія транзакцій");
            System.out.println("0. Вихід");

            System.out.print("Твій вибір: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Сума поповнення: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Сума зняття: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Поточний баланс: " + account.getBalance());
                    break;

                case 4:
                    account.printTransactions();
                    break;

                case 0:
                    running = false;
                    System.out.println("До побачення 👋");
                    break;

                default:
                    System.out.println("Невірний вибір");
            }
        }

        scanner.close();
    }
}
