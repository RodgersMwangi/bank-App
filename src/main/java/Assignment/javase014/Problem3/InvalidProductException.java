/*
Assessment 3: Javase014
Student: Rodgers Mwangi
Date: 1 Feb 2026
Problem 3

Key features
    abstract class design
    inheritance, overriding, error handling
*/
package Assignment.javase014.Problem3;

public class InvalidProductException extends RuntimeException{
    public InvalidProductException(String message){
        super(message);
    }

}
