public class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class BasicAccount extends BankAccount {
    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        }
    }
}

class OverdraftAccount extends BankAccount {
    public OverdraftAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            super.withdraw(amount + 30); // Overdraft penalty
        } else {
            super.withdraw(amount);
        }
    }
}
