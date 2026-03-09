
//Name: Rodgers Mwangi

package Assignment.javase005;

import java.util.Scanner;

public class Assessment1_RodgersMwangi {
    
    public static void main(String[] args){
        

        variableOperations();   //Quiz 1
        //gradeCalculator();      //Quiz 2
        //numberSequence();       //Quiz 3
        //inputValidation();      //Quiz 4
        //patternPrinting();      //Quiz 5
        //patternPrintingBonus();   //Quiz 5 bonus
    }

    public static void variableOperations(){

        /* 
        Quiz Problem 1: Variable Operations
         */

        int a=15;
        int b=4;
        int c=7;

        int sum=a+b+c;  //Calculate Sum
        int product=a*b; //Calculate product
        int expressionResult=(a+b)*c; //Calculate expression
        int remainder=a%b; //Calculate remainder

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Expression Result: "+ expressionResult);
        System.out.println("Remainder: " + remainder);
    }


    /*
        Quiz Problem 2: Grade Calculator
    */
    public static void gradeCalculator(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student score: ");
        int studentScore=scanner.nextInt();

        if(studentScore>=0 && studentScore<=100){
            if(studentScore>=90){
                System.out.println("Grade: A");
            }else if(studentScore>=80){
                System.out.println("Grade: B");
            }else if(studentScore>=70){
                System.out.println("Grade: C");
            }else if(studentScore>=60){
                System.out.println("Grade: D");
            }else{
                System.out.println("Grade: F");
            }
        }else{
            System.out.println("Error: Score must be between 0 and 100");
        }
        scanner.close();

    }


    /*
        Quiz Problem 3: Number Sequence
    */
    public static void numberSequence(){

        for(int number=1; number<=20;number++){  //for loop to determine even, odd and divisibles of 5
            if(number%2==0 && number%5==0){
                System.out.println(number + " - Even, Multiple of 5");
            }else if(number%2==1 && number%5==0){
                System.out.println(number + " - Odd, Multiple of 5");
            }else if(number%2==0){
                System.out.println(number + " - Even");
            }else{
                System.out.println(number + " - Odd");
            }
        }
    }


        /*
        Quiz Problem 4: Input Validation
        */
    public static void inputValidation(){

        int factorial=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int integer=scanner.nextInt();

        //while loop to keep asking user for valid input
        while(integer<=0){
            System.out.print("Invalid input! Please enter a positive integer: ");
            integer=scanner.nextInt();
        }
        
        //for loop to determine the factorial of user's input
        for(int n=integer; n>0; n--){
            factorial*=n;
        }
        System.out.println("Factorial of " + integer + " is: " + factorial);
        scanner.close();
    }



         /*
        Quiz Problem 5: Pattern Printing
        */
    public static void patternPrinting(){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"); //print out * in an ascending order
            }
            
            
            System.out.println("");
        }
    }

         /*
        Quiz Problem 5 Bonus: Pattern Printing (Pyramid pattern)
        */

    public static void patternPrintingBonus(){
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


