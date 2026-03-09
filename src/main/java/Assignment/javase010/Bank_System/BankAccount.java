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

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;
    protected boolean error;

    //constructor
    public BankAccount(String accountNumber, String accountHolder, double balance){
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    //getters and setters
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

    //method to deposit
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

    @Override
    public String toString(){ //overridden toString method
        System.out.println();
        System.out.println("=======================================");
        return "Account Number: "+ accountNumber + "\nAccount Holder: "+accountHolder+ "\nBalance: "+balance;
    }



}
