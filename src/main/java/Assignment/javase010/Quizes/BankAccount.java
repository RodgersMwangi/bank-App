package Assignment.javase010.Quizes;

/* QUIZ 4 */

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;
    protected boolean error;

    //Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance){
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    //setters and getters
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        if(accountHolder.isEmpty()){
            System.out.println("Account Holder cannot be empty");
            error=true;
        }else{
            this.accountHolder = accountHolder;
        }
        
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if(accountNumber.isEmpty()){
            System.out.println("Account Number cannot be empty");
            error=true;
        }else{
            this.accountNumber = accountNumber;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance<0){
            System.out.println("Balance cannot be a negative number");
        }
        else{
            this.balance = balance;
        }
        
    }

    //method to deposit money
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Deposit amount must be above zero");
            error=true;
        }
    }

    //method to withdraw 
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }else if(amount<=0){
            System.out.println("You cannot withdraw amount equaling zero or less");
        }
        else{
            System.out.println("Insufficient funds");
            error=true;
        }
    }



}
