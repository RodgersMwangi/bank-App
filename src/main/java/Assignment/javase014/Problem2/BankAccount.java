/*
Assessment 3: Javase014
Student: Rodgers Mwangi
Date: 1 Feb 2026
Problem 2

Key features
    inheritance, method overriding, error handling
    method overloading
*/

package Assignment.javase014.Problem2;

import java.util.ArrayList;


public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    protected boolean error;
    

    public BankAccount(String accountNumber, String accountHolder, double balance){
        setAccountNumber(accountNumber);
        this.balance=balance;
        setAccountHolder(accountHolder);
        
    

    }
    
    public void setAccountHolder(String accountHolder) {
        if(!accountHolder.trim().isEmpty()){
            this.accountHolder = accountHolder;
        }else{
            throw new InvalidTransactionException();
        }
    }
    public void setAccountNumber(String accountNumber) {
        if(!accountNumber.trim().isEmpty()){
            this.accountNumber = accountNumber;
        }else{
            throw new InvalidTransactionException();
        }
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    
    //methods
    public void deposit(double amount){
        if(amount<=0){
            throw new InvalidTransactionException(amount);
        }else{
           
            System.out.println("Current Balance is "+ balance);
            balance+=amount;
            System.out.println("You have deposited "+amount);
            System.out.println("New Balance is "+balance);
             System.out.println("\n\n==============================");

        }
    }
    public void deposit(double amount, boolean transfer){ //method overloading
        if(amount<=0){
            throw new InvalidTransactionException(amount);
        }else{
            balance+=amount;
           System.out.println("Transfer complete!");

        }
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException(amount, balance);
        }if(amount<=0){
            throw new InvalidTransactionException(amount,true);
        }
        else{
            
            System.out.println("Current Balance is "+ balance);
            balance-=amount;
            System.out.println("You have withdrawn "+amount);
            System.out.println("New Balance is "+balance);
             System.out.println("\n\n==============================");
        }
    }

    //overloading the withdraw method
    public void withdraw(double amount, String depositedAccountName) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException(amount, balance, true);
        }if(amount<=0){
            throw new InvalidTransactionException(amount, true);
        }
        else{
            
            System.out.println("Current Balance is "+ balance);
            balance-=amount;
            System.out.println("You have transferred "+amount+" to "+depositedAccountName);
            System.out.println("New Balance is "+balance);
             System.out.println("\n\n==============================");
        }
    }
    public void transfer(String accountNumber, double amount, ArrayList<BankAccount> accounts) throws InsufficientFundsException{
        if(amount<=0){
            throw new InvalidTransactionException(amount, "Transfer");
        }else{
            BankAccount found=null;
            for(BankAccount a: accounts){
                
                if(a.accountNumber==accountNumber){
                    found=a;
                    if(a.accountNumber==this.accountNumber){
                        System.out.println("You cannot transfer funds to your own account");

                    }else{
                        withdraw(amount, a.accountHolder);
                        found.deposit(amount, true);
                    }
                    
                    break;
                }
            }
            if(found==null){
                throw new AccountNotFoundException(accountNumber);
            }
            
        }
    }


}
