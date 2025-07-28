
class BankAccount{
    private double balance = 0.0;

    public void deposite(double  amt){
        if(amt > 0 ){
            balance += amt;
            System.out.println("Deposited : " + amt);
        }
        else{
            System.out.println("The amount must be greater than 0.");
        }
    }

    public void withdraw(double  amt){
        if(amt <= 0 ){
            System.out.println("The amount must be greater than 0.");
        }
        else if (amt > balance) {
            System.out.println("Insufficient balance...");
        }
        else{
            balance -= amt;
            System.out.println("Withdrawn : " + amt);
        }
    }    

    public void getBalance(){
        System.out.println("The Current balance is : " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposite(100.50);
        account.getBalance();
        account.withdraw(50);
        account.getBalance();
        account.withdraw(60.10);
        account.getBalance();
    }
}