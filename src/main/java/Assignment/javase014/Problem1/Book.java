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

public class Book extends LibraryItem{
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, String genre){
        super(itemId, title, author);
        setIsbn(isbn);
        setGenre(genre);
        setAvailable(true);
    }
    public void setIsbn(String isbn){
        if(!isbn.trim().isEmpty()){
            this.isbn=isbn;
        }else{
            //System.out.println("Invalid Isbn");
            error=true;
        }
    }
    public String getIsbn() {
        return isbn;
    }
    public void setGenre(String genre) {
        if(!genre.trim().isEmpty()){
            this.genre=genre;
        }else{
            //System.out.println("Invalid Genre");
            error=true;
        }
    }
    public String getGenre() {
        return genre;
    }
    //Overriding methods
    @Override
    public void checkout(){
        if(isAvailable() && !error){
            System.out.println("You have borrowed the book "+ this.getTitle());
            setAvailable(false);
        }else if(error){
            System.out.println("Insufficient details provided about this Book");
        }
        else{
            System.out.println("The book "+getTitle()+" is not available");
        }
    }

    @Override
    public void returnItem(){
        if(!isAvailable() && !error){
            System.out.println("You have returned the book: "+this.getTitle());
            setAvailable(true);
        }else if(error){
            System.out.println("Insufficient details provided about this Book");
        }
        else{
            System.out.println("You had not borrowed this book");
        }
    }
    @Override
    public void displayDetails(){
        System.out.println("Item ID: "+getItemId());
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Isbn: "+getIsbn());
        System.out.println("Genre: "+getGenre());
        if(isAvailable()){
            System.out.println("Available");
        }else{
            System.out.println("Unavailable");
        }
    }

}
