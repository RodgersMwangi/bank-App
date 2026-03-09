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

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable;
    protected boolean error;

    public LibraryItem(String itemId, String title, String author){
        setAuthor(author);
        setItemId(itemId);
        setTitle(title);
        this.isAvailable=true;
        
    }

    //getters and setters
    public void setItemId(String itemId){
        if(!itemId.trim().isEmpty()){
            this.itemId=itemId;
        }else{
            //System.out.println("Invalid Item ID");
            error=true;
        }
    }
    public String getItemId(){
        return itemId;
    }
    public void setTitle(String title) {
        if(!title.trim().isEmpty()){
            this.title=title;
        }else{
            //System.out.println("Invalid Title");
            error=true;
        }
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        if(!author.trim().isEmpty()){
            this.author=author;
        }else{
            //System.out.println("Invalid Author");
            error=true;
        }
    }
   
    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    //abstract methods
    public abstract void checkout();
    public abstract void returnItem();
    public abstract void displayDetails();



}
