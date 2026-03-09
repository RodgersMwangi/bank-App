/*
    Basic Bank Account System
    Student: Rodgers Mwangi
    Date: 25th Jan 2026

Features implemented
    Encapsulation
    Inheritance
    Polymorphism
    Error Handling

*/

package Assignment.javase010.Bank_System;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    //constructor
    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit){
        super(accountNumber, accountHolder, balance);
        setOverdraftLimit(overdraftLimit);;
    }

    //setter and getter for overdraftlimit
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

    @Override
    public String toString(){ //overridden tostring method
        System.out.println();
        System.out.println("=======================================");
        return "Account Number: "+ super.getAccountNumber() + "\nAccount Holder: "+super.getAccountHolder()+ "\nBalance: "+super.getBalance()+ "\nOverdraft Limit: "+ overdraftLimit;
        
    }
}
