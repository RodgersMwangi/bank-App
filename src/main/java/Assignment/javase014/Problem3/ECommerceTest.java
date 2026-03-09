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

public class ECommerceTest {
    public static void main(String[] args) {
        try{
        Product laptop=new Electronics("E001", "Dell", 50000, 8, 12, 55);
        Product jeans=new Clothing("C001", "Diesel", 3000, 20, "L", "Denim", "blue");
        Product atlas=new Books("B001", "World Atlas", 400, 20, "Jane Doe", "Moran", "423323-4555");

        System.out.println(laptop.calculateDiscount(5));
        atlas.applyTax();
        atlas.reduceStock(10);

        atlas.displayProductInfo();

        }catch(InvalidProductException e){
            System.out.println(e.getMessage());

        }catch(OutofStockException e){
            System.out.println(e.getMessage());
        }
    }

}
