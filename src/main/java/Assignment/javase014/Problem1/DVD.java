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

public class DVD extends LibraryItem{
    private int duration;
    private String rating;

    public DVD(String itemId, String title, String author, int duration, String rating){
        super(itemId, title, author);
        setDuration(duration);
        setRating(rating);
        
    }
    public void setDuration(int duration) {
         if(duration>0){
            this.duration=duration;
        }else{
            //System.out.println("Invalid Duration");
            error=true;
        }
    }
    public int getDuration() {
        return duration;
    }
    public void setRating(String rating) {
         if(!rating.trim().isEmpty()){
            this.rating=rating;
        }else{
            //System.out.println("Invalid Rating");
            error=true;
        }
    
    }
    public String getRating() {
        return rating;
    }
    //Overriding methods
    @Override
    public void checkout(){
        if(isAvailable() && !error){
            System.out.println("You have borrowed the DVD "+ this.getTitle());
            setAvailable(false);
        }else if(error){
            System.out.println("Insufficient details provided about this DVD");
        }
        else{
            System.out.println("The DVD "+getTitle()+" is not available");
        }
    }

    @Override
    public void returnItem(){
        if(!isAvailable() && !error){
            System.out.println("You have returned the DVD: "+this.getTitle());
            setAvailable(true);
        }else if(error){
            System.out.println("Insufficient details provided about this DVD");
        }
        else{
            System.out.println("You had not borrowed this DVD");
        }
    }
    @Override
    public void displayDetails(){
        System.out.println("Item ID: "+getItemId());
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Duration: "+getDuration());
        System.out.println("Rating: "+getRating());
        if(isAvailable()){
            System.out.println("Available");
        }else{
            System.out.println("Unavailable");
        }
        }


}
