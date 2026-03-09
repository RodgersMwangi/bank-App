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

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem[] items={
        new Book("B001", "Jane Doe", "John Doe", "123-452884723", "Education"),
        new DVD("D001", "Java Tutorial", "Jane Smith", 120, " "),
        new Magazine("M001", "Tech Monthly", "Tech Press", 15, "2024-033-01")
    };

    for(LibraryItem item: items){
        item.displayDetails();
        System.out.println("======================================");
        item.checkout();
        System.out.println("======================================");
        
    }
    }

}
