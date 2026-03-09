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

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity){
        setProductId(productId);
        setName(name);
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    //setters
    public void setProductId(String productId) {
        if(!productId.trim().isEmpty()){
            this.productId=productId;
        }else{
            throw new InvalidProductException("Invalid product Id");
        }
    }
    public void setName(String name) {
        if(!name.trim().isEmpty()){
            this.name = name;
        }else{
            throw new InvalidProductException("Invalid product Name");
        }
        
    }
    public void setPrice(double price) {
        if(price>0){
            this.price=price;
        }else{
            throw new InvalidProductException("Price must be above zero");
        }
       
    }
    public void setStockQuantity(int stockQuantity) {
        if(stockQuantity>=0){
            this.stockQuantity = stockQuantity;
        }else{
            throw new InvalidProductException("Stock quantity cannot be a negative number");
        }
        
    }

    //getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getProductId() {
        return productId;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }

    //abstract methods
    public abstract double calculateDiscount(double discount);
    public abstract String getProductType();

    public void applyTax(){
        double taxedPrice=price;
        taxedPrice*=0.2;
        price=price+taxedPrice;
        System.out.println("Price after tax: "+price);

    }

    public void reduceStock(int quantity) throws OutofStockException{
        if(quantity<=stockQuantity){
            stockQuantity-=quantity;
            System.out.println("New Stock quantity: "+stockQuantity);
        }else{
            throw new OutofStockException("Not enough in stock!");
        }
        
    }


    public void displayProductInfo(){
        System.out.println("PRODUCT DETAILS");
        System.out.println("_________________________");
        System.out.println("Product Id: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Stock Quantity: "+stockQuantity);
    }

}
