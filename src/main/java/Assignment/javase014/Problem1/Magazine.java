/*
Assessment 3: Javase014
Student: Rodgers Mwangi
Date: 1 Feb 2026
Problem 1

Key features
    inheritance, method overriding, error handling
    polymorphism
    encapsulation
*/

package Assignment.javase014.Problem1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Magazine extends LibraryItem{
    private int issueNumber;
    private LocalDate publicationDate;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate){
        super(itemId, title, author);
        setIssueNumber(issueNumber);
        setPublicationDate(publicationDate);
    }
    public void setIssueNumber(int issueNumber) {
        if(issueNumber>0){
            this.issueNumber=issueNumber;
        }else{
            //System.out.println("Invalid Issue Number");
            error=true;
        }
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setPublicationDate(String publicationDate) {
        try{
            this.publicationDate = LocalDate.parse(publicationDate);
        }catch(DateTimeParseException e){
            
            error=true;
        }
    }
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    //Overriding methods
    @Override
    public void checkout(){
        if(isAvailable() && !error){
            System.out.println("You have borrowed the magazine"+ this.getTitle());
            setAvailable(false);
        }else if(error){
            System.out.println("Insufficient details provided about this magazine");
        }
        else{
            System.out.println("The magazine "+getTitle()+" is not available");
        }
    }

    @Override
    public void returnItem(){
        if(!isAvailable() && !error){
            System.out.println("You have returned the magazine: "+this.getTitle());
            setAvailable(true);
        }else if(error){
            System.out.println("Insufficient details provided about this magazine");
        }
        else{
            System.out.println("You had not borrowed this magazine");
        }
    }
    @Override
    public void displayDetails(){
        System.out.println("Item ID: "+getItemId());
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Issue Number: "+getIssueNumber());
        if(publicationDate==null){
            System.out.println("Invalid Date was provided");
        }else{
            System.out.println("publication Date: "+getPublicationDate());
        }
        
        if(isAvailable()){
            System.out.println("Available");
        }else{
            System.out.println("Unavailable");
        }
    }
    

}
