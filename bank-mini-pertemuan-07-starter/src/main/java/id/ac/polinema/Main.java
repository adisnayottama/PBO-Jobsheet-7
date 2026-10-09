package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Budi", "0812-9999-8888");
        BusinessAccount business = new BusinessAccount("B001", customer, 2000000, 50000);

        boolean result = business.withdraw(1500000);
        System.out.println("Withdraw 1500000 allowed? " + result);
        business.printInfo();
    }
}