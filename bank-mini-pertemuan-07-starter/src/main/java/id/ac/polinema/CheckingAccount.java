package id.ac.polinema;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Meng-override canWithdraw untuk mengizinkan penarikan hingga saldo + overdraftLimit
    @Override 
    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= getBalance() + overdraftLimit;
    }

    // Meng-override printInfo untuk menambah informasi tipe rekening dan overdraft limit
    @Override 
    public void printInfo() {
        super.printInfo();  // Memanggil printInfo milik Account
        System.out.println("Account type: Checking, overdraft limit: " + overdraftLimit);
    }
}
