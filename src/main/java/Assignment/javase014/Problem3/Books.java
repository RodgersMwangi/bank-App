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

public class Books extends Product{
    private String author;
    private String publisher;
    private String isbn;

    public Books(String productId, String name, double price, int stockQuantity, String author, String publisher, String isbn){
        super(productId, name, price, stockQuantity);
        setAuthor(author);
        setIsbn(isbn);
        setPublisher(publisher);

    }

    //setters
    public void setAuthor(String author) {
        if(!author.trim().isEmpty()){
            this.author=author;
        }else{
            throw new InvalidProductException("Invalid Author");
        }
    }
    public void setPublisher(String publisher) {
        if(!publisher.trim().isEmpty()){
            this.publisher=publisher;
        }else{
            throw new InvalidProductException("Invalid Publisher");
        }
    }
    public void setIsbn(String isbn) {
        if(!isbn.trim().isEmpty()){
            this.isbn=isbn;
        }else{
            throw new InvalidProductException("Invalid Isbn");
        }
    }

    //getters
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public double calculateDiscount(double discount){
        return discount/100*price;

    }

    @Override
    public String getProductType(){
        return "Books";
    }

    @Override
    public void displayProductInfo(){
        System.out.println("PRODUCT DETAILS-Books");
        System.out.println("_________________________");
        System.out.println("Product Id: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Price: KSH "+price);
        System.out.println("Stock Quantity: "+stockQuantity);
        System.out.println("Author: "+author);
        System.out.println("Publisher: "+publisher);
        System.out.println("Isbn: "+isbn);
    }

}
