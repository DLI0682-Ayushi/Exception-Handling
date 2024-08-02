public class BankingSystem {
    private double balance;
    public BankingSystem(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalance("Insufficient balance...." , balance);
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args)  {
        try{
            BankingSystem account = new BankingSystem(200);
            account.deposit(100);
            System.out.println(account.getBalance());
            account.withdraw(500);
            System.out.println(account.getBalance());
        }
        catch(InsufficientBalance e) {

            System.out.println(e.getMessage());
        }
    }
}
class InsufficientBalance extends RuntimeException {
    private final double balance;
    public InsufficientBalance(String message, double balance) {
        super(message);
        this.balance = balance;
    }
}



