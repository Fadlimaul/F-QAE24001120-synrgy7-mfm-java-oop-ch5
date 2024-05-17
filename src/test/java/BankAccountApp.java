public class BankAccountApp {
    public static void main(String[] args) {
        // object dengan parameter
        BankAccount account = new BankAccount("666", 230000.00, "Rafael Struick", "rafaelgans87@gmail.com", "089657483729");
        //account.BankAccount();
        // Mengambil nilai dari object
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Customer Email: " + account.getCustomerEmail());
        System.out.println("Customer Phone: " + account.getCustomerPhone());
        System.out.println("Initial Balance: " + account.getBalance());

        // Melakukan deposit
        System.out.println("\nMelakukan deposit sebesar 19000");
        account.deposit(19000.00);

        // Melakukan withdraw
        System.out.println("\nMelakukan withdraw sebesar 15000");
        account.withdraw(15000.00);

        // Mencoba withdraw dengan jumlah lebih besar dari saldo
        System.out.println("\nMencoba withdraw sebesar 10000");
        account.withdraw(10000.00);

        /**BankAccount account2 = new BankAccount();
        account2.setAccountNumber("777");
        account2.setCustomerName("ilham");
        account2.setBalance(300000.00);
        account2.setCustomerEmail("ilhamudin17@gmail.com");
        account2.setCustomerPhone("089756357284");
        account2.BankAccount();

        // Melakukan deposit
        System.out.println("\nMelakukan deposit sebesar 19000");
        account2.deposit(19000.00);

        // Melakukan withdraw
        System.out.println("\nMelakukan withdraw sebesar 15000");
        account2.withdraw(15000.00);

        // Mencoba withdraw dengan jumlah lebih besar dari saldo
        System.out.println("\nMencoba withdraw sebesar 10000");
        account2.withdraw(10000.00);**/
    }
}