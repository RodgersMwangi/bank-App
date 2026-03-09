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

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String accountNumber){
        super("Account with account Number "+accountNumber+" not found");
    }

}
