import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BankAccount    {

    // Field atau Attribute
    String accountNumber;
    Double balance;
    String customerName;
    String customerEmail;
    String customerPhone;

    // Constructor
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Getter & Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // Method deposit
    public void deposit (double jumlah) {
        if (jumlah > 0) {
            balance += jumlah;
            System.out.println("Deposit sukses. balance terbaru: " + balance);
        } else {
            System.out.println("Deposit tidak boleh kosong.");
        }
    }
    // Method withdraw
    public void withdraw (double jumlah) {
        if (jumlah > balance) {
            System.out.println("Saldo tidak cukup");
        } else if (jumlah > 0) {
            balance -= jumlah;
            System.out.println("withdraw sukses, balance tersisa " +balance);
        } else {
            System.out.println("Deposit tidak boleh kosong.");
        }
    }
}

