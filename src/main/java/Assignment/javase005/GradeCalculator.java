package Assignment.javase005;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){

        //2 for loops nested in one for loop to print out the top half of the pyramid

        for(int i=1; i<=5; i++){

            //first for loop prints out spaces in a decreasing order
            for(int k=5; k>=i; k--){
            
                System.out.print(" ");
            
            }
        
            //second for loop prints out * in an ascending order    
            for(int j=1; j<=i; j++){
                
                System.out.print("*");
                if(j>1){
                    System.out.print("*"); //adds an extra * for each * printed except the first one
                }
                
            }
            
            
            System.out.println("");
        }

        //2 for loops nested inside a for loop to print out the bottom half of the pyramid
        
        int p=2;
        for(int m=4; m>=1;m--){
            
            //first for loop prints out spaces in an increasing order
            for(int n=p; n>=1; n--){
                System.out.print(" ");
            }

            //second for loop prints out * in a descending order
            for(int o=m; o>=1; o--){
                if(o>1){
                    System.out.print("*");  //adds an extra * to each * printed except the last one
                }
                System.out.print("*");
                
            }
            System.out.println("");
            p++;
        }

        
        
    }

}
