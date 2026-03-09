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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bank {
    List <String> accountIds=new ArrayList<>(Arrays.asList());
    ArrayList <BankAccount> bankAccounts = new ArrayList<>();
    ArrayList <SavingsAccount> savingsAccounts=new ArrayList<>();
    ArrayList <CheckingAccount> checkingAccounts=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public Bank(){
        
    }
    
    

    //method to create a savings account
    public void addSavingsAccount(){
        
        
        System.out.println("Enter your full name");
        String name=scanner.nextLine();
        while(name.isEmpty() || name.length()<2){ //ensure that name field is not empty
            System.out.println("Name field must have atleast two characters");
            name=scanner.nextLine();
        }
        System.out.println("Enter your Id number");
        String id=scanner.nextLine();
        while(id.isEmpty() || id.length()<6 || !id.matches("\\d+")){ //ensure that id field only has numbers and atleast 6 characters
            System.out.println("Id field must have atleast 6 numeric characters");
            id=scanner.nextLine();
        }
        while(accountIds.contains(id)){ //check if the id is already in the system
            System.out.println("Id already exists in system. Please input a new id.");
            id=scanner.nextLine();
        }
        accountIds.add(id);
        SavingsAccount savingsAccount1 = new SavingsAccount(id, name, 0);
        savingsAccounts.add(savingsAccount1);
        System.out.println("Account: "+ savingsAccount1.getAccountHolder() + " with Account Number: "+ savingsAccount1.getAccountNumber()+ " created\nYour balance is: "+savingsAccount1.getBalance());
        //scanner.close();
    }

    //method to create a new checking account
    public void addCheckingAccount(){
        
        
        System.out.println("Enter your full name");
        String name=scanner.nextLine();
        while(name.isEmpty() || name.length()<2){ //disallow empty name field inputs
            System.out.println("Name field must have atleast two characters");
            name=scanner.nextLine();
        }
        System.out.println("Enter your Id number");
        String id=scanner.nextLine();
        while(id.isEmpty() || id.length()<6 || !id.matches("\\d+")){
            System.out.println("Id field must have atleast 6 numeric characters");
            id=scanner.nextLine();
        }
         while(accountIds.contains(id)){
            System.out.println("Id already exists in system. Please input a new id.");
            id=scanner.nextLine();
        }
        accountIds.add(id);
        CheckingAccount checkingAccount = new CheckingAccount(id, name, 0,250);
        checkingAccounts.add(checkingAccount);
        System.out.println("Checking Account: "+ checkingAccount.getAccountHolder() + " with Account Number: "+ checkingAccount.getAccountNumber()+ " created\nYour balance is: "+checkingAccount.getBalance());
        
    }

    public void displayAllAccounts(){
        for(SavingsAccount b :savingsAccounts){ //loop through all savings accounts
            System.out.println(b);
        }
        for(CheckingAccount c :checkingAccounts){ //loop through all checking accounts
            System.out.println(c);
        }
    }
    public SavingsAccount findSavingsAccount(){

        //method to search for a created savings account by their id

        SavingsAccount foundAccount=null;
        System.out.println("Enter your id: ");
        String id=scanner.nextLine();
        for(SavingsAccount s: savingsAccounts){
            if(s.getAccountNumber().equals(id)){
                foundAccount=s;
                
                break;
            }
            
        }
        
        
        
        if(foundAccount!=null){
            return foundAccount;
        }else{
            return null;
        }
        
        

    }

    //method to search for checking account by their id
    public CheckingAccount findCheckingAccount(){
        System.out.println("Enter your id: ");
        CheckingAccount foundCheckingAccount=null;
         String id=scanner.nextLine();
         for(CheckingAccount c: checkingAccounts){
            if(c.getAccountNumber().equals(id)){
                foundCheckingAccount=c;
                break;
            }
        }
        
        if(foundCheckingAccount!=null){
            return foundCheckingAccount;
        }else{
            return null;
        }

    }

    public double totalBalance(){ //method to calculate all the money currently saved
        double totalBalanceCheckingAccounts=0;
        double totalBalanceSavingsAccounts=0;
        for(CheckingAccount c: checkingAccounts){
            totalBalanceCheckingAccounts+=c.getBalance();
        }
        for (SavingsAccount s: savingsAccounts){
            totalBalanceSavingsAccounts+=s.getBalance();
        }
        return totalBalanceCheckingAccounts+totalBalanceSavingsAccounts;
        
    }

    public void applyInterestToSavingsAccounts(){ //method to apply interest to all saving accounts
        for (SavingsAccount s: savingsAccounts){
            s.applyInterest();
        }
        System.out.println("==========================================");
        System.out.println("Interest applied for all savings accounts");
    }

    public void closingScanner(){
        scanner.close();
    }

}
