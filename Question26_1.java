import java.util.ArrayList;

public class Question26_1 {
    private int accountNumber;
    private double balance;
    private ArrayList<String> transactionLog;

    public Question26_1(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionLog = new ArrayList<>();
        transactionLog.add("Account created with balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionLog.add("Deposited: " + amount + ", New balance: " + balance);
        } else {
            transactionLog.add("Failed deposit: " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionLog.add("Withdrew: " + amount + ", New balance: " + balance);
            return true;
        } else {
            transactionLog.add("Failed withdrawal: " + amount);
            return false;
        }
    }

    public double checkBalance() {
        transactionLog.add("Checked balance: " + balance);
        return balance;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Transaction Log for Account " + accountNumber + ":");
        for (String log : transactionLog) {
            System.out.println(log);
        }
        super.finalize();
    }
}
