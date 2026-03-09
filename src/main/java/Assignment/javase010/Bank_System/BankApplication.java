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

import java.util.Scanner;

public class BankApplication {
    
    public static void main(String[] args) {
        Bank bank=new Bank();
        SavingsAccount savingsAccount1=new SavingsAccount("null", "null",0);
        CheckingAccount checkingAccount1=new CheckingAccount("null", "null", 0, 250);
        int option=0;
        Scanner scanner2=new Scanner(System.in);

        do{
            System.out.println("===Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interests (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Exit");
            System.out.println();
            System.out.println("Enter the desired number option");
            option=scanner2.nextInt();
            while(option<1 || option > 8 ){
                System.out.println("Invalid option, try again");
                option=scanner2.nextInt();
            }
            switch(option){
                case 1: //Create Savings Account option
                    bank.addSavingsAccount();
                    break;
                case 2: //Create Checking Account option
                    bank.addCheckingAccount();
                    break;
                case 3: //Deposit
                    System.out.println("1. Deposit to Savings account");
                    System.out.println("2. Deposit to Checking account");
                    int accountOption=scanner2.nextInt();
                    while(accountOption!=1 && accountOption!=2){
                        System.out.println("Invalid option, try again");
                        accountOption=scanner2.nextInt();
                    }
                    if(accountOption==1){
                        savingsAccount1=bank.findSavingsAccount();
                        System.out.println("Found\n"+ savingsAccount1);
                        if(savingsAccount1==null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("How much would you like to deposit?");
                        double depositAmount=scanner2.nextDouble();
                        savingsAccount1.deposit(depositAmount);
                        System.out.println(savingsAccount1);
                        System.out.println();
                        
                    }else{
                        checkingAccount1=bank.findCheckingAccount();
                        System.out.println("Found\n"+ checkingAccount1);
                        if(checkingAccount1==null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("How much would you like to deposit?");
                        double depositAmount=scanner2.nextDouble();
                        checkingAccount1.deposit(depositAmount);
                        System.out.println(checkingAccount1);
                        System.out.println();
                        
                    }
                    break;
                case 4: //Withdraw
                    System.out.println("1. Withdraw from Savings account");
                    System.out.println("2. Withdraw from Checking account");
                    int accountOption2=scanner2.nextInt();
                    while(accountOption2!=1 && accountOption2!=2){
                        System.out.println("Invalid option, try again");
                        accountOption2=scanner2.nextInt();
                    }
                    if(accountOption2==1){
                        savingsAccount1=bank.findSavingsAccount();
                        System.out.println("Found\n"+ savingsAccount1);
                        if(savingsAccount1==null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("How much would you like to withdraw?");
                        double withdrawAmount=scanner2.nextDouble();
                        savingsAccount1.withdraw(withdrawAmount);
                        System.out.println(savingsAccount1);
                        
                    }else{
                        checkingAccount1=bank.findCheckingAccount();
                        System.out.println("Found\n"+ checkingAccount1);
                        if(checkingAccount1==null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("How much would you like to withdraw?");
                        double withdrawAmount=scanner2.nextDouble();
                        checkingAccount1.withdraw(withdrawAmount);
                        System.out.println(checkingAccount1);
                        
                    }
                    break;
                case 5: //Check balance
                    System.out.println("1. Check balance for Savings account");
                    System.out.println("2. Check balance for Checking account");
                    int accountOption3=scanner2.nextInt();
                    while(accountOption3!=1 && accountOption3!=2){
                        System.out.println("Invalid option, try again");
                        accountOption3=scanner2.nextInt();
                    }
                    if(accountOption3==1){
                        savingsAccount1=bank.findSavingsAccount();
                        if(savingsAccount1==null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("Your balance is "+savingsAccount1.getBalance());
                    }else{
                        checkingAccount1=bank.findCheckingAccount();
                        if(checkingAccount1==null){
                            System.out.println("Account not found");
                            break;
                        }
                        System.out.println("Tour Balance is "+checkingAccount1.getBalance());
                    }
                    break;
                case 6: //Apply interest 
                    bank.applyInterestToSavingsAccounts();
                    break;

                case 7: //Display all accounts
                    bank.displayAllAccounts();
                    break;
            }


        }while(option!=8);
         
        bank.closingScanner();
        scanner2.close();
        

        
        
    }


}
