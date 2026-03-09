package Assignment.javase010.Quizes;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    //constructor
    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit){
        super(accountNumber, accountHolder, balance);
        setOverdraftLimit(overdraftLimit);;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit<0){
            System.out.println("Overdraft limit cannot be a negative number");
            error=true;
        }else{
            this.overdraftLimit = overdraftLimit;
        }
        
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount){ //overridden withdraw method
        if(amount>0 && amount<=(balance+overdraftLimit)){
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
