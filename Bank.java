class BankAccount {
    
    private String accountHolder;
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        
        if (balance < 0) {
            System.out.println("Invalid balance Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    
    public BankAccount(String accountHolder, String accountNumber) {
        
        this(accountHolder, accountNumber, 0);
    }

    
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative! Update failed.");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    
    @Override
    public String toString() {
        return "Account Holder: " + accountHolder +
               ", Account Number: " + accountNumber +
               ", Balance: " + balance;
    }
}

public class Bank  {
    public static void main(String[] args) {
       
        BankAccount acc1 = new BankAccount("Rudranil", "123456", 5000);
        System.out.println(acc1);

        
        BankAccount acc2 = new BankAccount("Aman", "987654");
        System.out.println(acc2);

        
        acc2.setBalance(3000);
        System.out.println("After updating balance: " + acc2);

        
        acc2.setBalance(-1000);
    }
}
