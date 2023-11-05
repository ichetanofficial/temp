class BankAccount {
    protected double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    double calculateInterest() {
        return 0.0;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    @Override
    double calculateInterest() {
        return balance * (interestRate / 100);
    }
}
class CheckingAccount extends BankAccount {
    private double monthlyFee;
    public CheckingAccount(double balance, double monthlyFee) {
        super(balance);
        this.monthlyFee = monthlyFee;
    }
    @Override
    double calculateInterest() {
        return -monthlyFee;
    }
}
public class OverrideExp {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(5000.0, 3.5);
        double savingsInterest = savingsAccount.calculateInterest();
        System.out.println("Savings Account Interest: RS" + savingsInterest);
        CheckingAccount checkingAccount = new CheckingAccount(2000.0, 10.0);
        double checkingInterest = checkingAccount.calculateInterest();
        System.out.println("Checking Account Interest/Fee: RS" + checkingInterest);

    }
}
