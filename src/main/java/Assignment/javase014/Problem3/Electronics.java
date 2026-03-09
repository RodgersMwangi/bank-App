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

public class Electronics extends Product{
    private int warrantyPeriod;
    private double powerConsumption;

    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod, double powerConsumption){
        super(productId, name, price, stockQuantity);
        setPowerConsumption(powerConsumption);
        setWarrantyPeriod(warrantyPeriod);

    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod>=0){
            this.warrantyPeriod = warrantyPeriod;
        }else{
            throw new InvalidProductException("Warranty period cannot be a negative number");
        }
        
    }

    public void setPowerConsumption(double powerConsumption) {
        if(powerConsumption>0){
            this.powerConsumption = powerConsumption;
        }else{
            throw new InvalidProductException("Power consumption cannot be zero or a negative number");
        }
        
    }
    public double getPowerConsumption() {
        return powerConsumption;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    @Override
    public double calculateDiscount(double discount){
        
        return discount/100*price;

    }

    @Override
    public String getProductType(){
        return "Electronics";
    }

    @Override
    public void displayProductInfo(){
        System.out.println("PRODUCT DETAILS-Electronics");
        System.out.println("_________________________");
        System.out.println("Product Id: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Price: KSH "+price);
        System.out.println("Stock Quantity: "+stockQuantity);
        System.out.println("Warranty Period: "+warrantyPeriod+" months");
        System.out.println("Power Consumption: "+powerConsumption+" Watts");
    }
}
