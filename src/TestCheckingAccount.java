public class TestCheckingAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100);
        System.out.println("Initial Balance: " + account.getBalance());

        account.withdraw(150);  // First overdraft
        System.out.println("Balance after first overdraft: " + account.getBalance());

        account.withdraw(50);   // Second overdraft in the same month
        System.out.println("Balance after second overdraft: " + account.getBalance());

        account.resetOverdrafts(); // Reset overdrafts for new month

        account.withdraw(50);   // First overdraft in new month
        System.out.println("Balance after new month first overdraft: " + account.getBalance());
    }
}
