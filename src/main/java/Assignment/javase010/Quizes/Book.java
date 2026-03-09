package Assignment.javase010.Quizes;

public class Book {

    private final String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private double price;
    

    boolean error;

    //constructor
    public Book(String isbn, String title, String author, boolean isAvailable, double price){
        if(isbn.length()!=13){
            System.out.println("isbn must be 13 digits");
            error=true;
            
        }
        if(!isbn.matches("\\d+")){
            System.out.println("Only numeric characters allowed");
            error=true;
            
        }
        
        this.isbn=isbn;
        
        this.isAvailable=isAvailable;
        setAuthor(author);
        setTitle(title);
        setPrice(price);
        
        

    }
    

    //setters and getters
    
    public String getIsbn() {
        
        return isbn;
    }
    
    
    public void setTitle(String title){
        if(title.isEmpty()){
            System.out.println("Title cannot be empty");
            error=true;
            return;
        }else{
            this.title=title;
        }
        
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author) {
        if(author.isEmpty()){
            System.out.println("Author cannot be empty");
            error=true;
        }else{
            this.author = author;
        }
        
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Price cannot be negative");
            error=true;
        }else{
            this.price = price;
        }
        
    }
    public double getPrice() {
        return price;
    }


    //methods
    //method to borrow book
    public void borrowBook(){
        if(error){
            return;
        }
        else if(isAvailable){
            System.out.println("You have borrowed "+ title + " \nIsbn: "+isbn);
            isAvailable=false;
        }else{
            System.out.println("The book titled "+ title + " is not available");
        }
    }

    //method to return book
    public void returnBook(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("You have returned "+ title + " \nIsbn: "+isbn);
        }else{
            System.out.println(title +" has not been borrowed yet.");
        }
        
    }

   
    @Override
    public String toString(){
        if(!error){
            System.out.println();
            System.out.println("=========================================");
            return " Title: " + title + "\n isbn: "+ isbn + "\n Author: "+ author+ "\n Availability: "+ isAvailable + "\n=========================================";
            
        }else{
            System.out.println("=========================================");
            return"An error occured\n=========================================";
        }
        
    }


}
