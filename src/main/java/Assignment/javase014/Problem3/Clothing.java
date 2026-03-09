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

public class Clothing extends Product{
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stockQuantity, String size, String material, String color){
        super(productId, name, price, stockQuantity);
        setColor(color);
        setSize(size);
        setMaterial(material);
    }

    //setters
    public void setSize(String size) {
        if(!size.trim().isEmpty()){
            this.size=size;
        }else{
            throw new InvalidProductException("Invalid Size");
        }
    }
    public void setMaterial(String material) {
        if(!material.trim().isEmpty()){
            this.material=material;
        }else{
            throw new InvalidProductException("Invalid Material");
        }
    }
    public void setColor(String color) {
        if(!color.trim().isEmpty()){
            this.color=color;
        }else{
            throw new InvalidProductException("Invalid Color");
        }
    }

    //getters
    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
    @Override
    public double calculateDiscount(double discount){
        return discount/100*price;

    }

    @Override
    public String getProductType(){
        return "Clothing";
    }

    @Override
    public void displayProductInfo(){
        System.out.println("PRODUCT DETAILS-Clothing");
        System.out.println("_________________________");
        System.out.println("Product Id: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Price: KSH "+price);
        System.out.println("Stock Quantity: "+stockQuantity);
        System.out.println("Size: "+size);
        System.out.println("Material: "+material);
        System.out.println("Colour: "+color);
    }

}
