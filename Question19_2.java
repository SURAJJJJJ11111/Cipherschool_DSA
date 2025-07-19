import java.util.ArrayList;

public class Question19_2 {
 


    private double balance;
    private ArrayList<String> transactions;

    public Question19_2(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account opened with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount + ", New balance: " + balance);
        } else {
            transactions.add("Attempted deposit of invalid amount: " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount + ", New balance: " + balance);
            return true;
        } else if (amount > balance) {
            transactions.add("Attempted withdrawal of: " + amount + " (Insufficient balance)");
        } else {
            transactions.add("Attempted withdrawal of invalid amount: " + amount);
        }
        return false;
    }

    public void printTransactionHistory() {
        for(String entry : transactions) {
            System.out.println(entry);
        }
    }

    public double getBalance() {
        return balance;
    }
}
