
public class BankAccountTwo {
    protected double balance;

    public BankAccountTwo(double initialBalance) {
        this.balance = initialBalance;
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

class CheckingAccount extends BankAccount {
    private int overdraftsThisMonth;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        overdraftsThisMonth = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            overdraftsThisMonth++;
            if (overdraftsThisMonth == 1) {
                balance -= (amount + 20); // First overdraft penalty
                System.out.println("First overdraft: $20 penalty applied.");
            } else {
                balance -= (amount + 30); // Additional overdrafts penalty
                System.out.println("Subsequent overdraft: $30 penalty applied.");
            }
        } else {
            super.withdraw(amount); // No overdraft, normal withdrawal
        }
    }

    public void resetOverdrafts() {
        overdraftsThisMonth = 0;
    }
}
