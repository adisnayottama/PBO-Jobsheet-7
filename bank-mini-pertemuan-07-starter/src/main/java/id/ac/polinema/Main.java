package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rian", "0812-0000-0003");
        SavingsAccount savings = new SavingsAccount("A003", customer, 100000, 0.02);

        // Mencegah penarikan 70000 karena saldo awal 100000 (sisa 30000 < MINIMUM_BALANCE 50000)
        boolean result = savings.withdraw(70000);
        System.out.println("Withdraw 70000 allowed? " + result);
        savings.printInfo();
    }
}