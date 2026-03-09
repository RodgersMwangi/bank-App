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

public class BankTest {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        try{
            BankAccount account1=new BankAccount("A001", "Jane Opi", 10000);
            BankAccount account2=new BankAccount("B001", "John Doe", 200);
            
            accounts.add(account1); //adding the accounts to an arrayList
            accounts.add(account2);
            

            account1.deposit(100);
            account2.deposit(200);
            account2.withdraw(200);
            account2.transfer("B001", 100,accounts);
            //System.out.println(account1.getBalance());
        }catch(InsufficientFundsException e){
            System.out.println("Funds Error: "+e.getMessage());
        }catch(InvalidTransactionException e){
            System.out.println("Transcation Error: "+e.getMessage());
        }catch(AccountNotFoundException e){
            System.out.println("Account error: "+e.getMessage());
        }finally{
            System.out.println("\n\nProgram Closing ...");
        }
    }

}
