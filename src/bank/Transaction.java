

    package bank;

import java.time.LocalDateTime;

    public class Transaction {
        public enum TransactionType {
            DEPOSIT,
            WITHDRAW}
        private final double amount;
        private final TransactionType type;
        private final LocalDateTime dateTime;

        public Transaction(double amount, TransactionType type) {
            this.amount = amount;
            this.type = type;
            this.dateTime = LocalDateTime.now();
        }

        public double getAmount() {
            return amount;
        }

        public TransactionType getType() {
            return type;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        @Override
        public String toString() {
            return dateTime + " | " + type + " | " + amount;
        }
    }

}
