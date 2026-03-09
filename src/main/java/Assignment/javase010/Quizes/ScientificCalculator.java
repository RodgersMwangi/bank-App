package Assignment.javase010.Quizes;

/*
QUIZ 3
*/

public class ScientificCalculator extends Calculator{
    public ScientificCalculator(){

    }

    @Override
    public int add(int a, int b){  //overridden add method
        int sum=a+b;
        System.out.println("Log: Adding "+a +"+"+b);
        return sum;
    }

    //method to calculate power
    public double power(double base, double exponent){
        double powerResult=1;
        if(exponent<=0){
            System.out.println("Exponent cannot be zero or less");
            return 0;

        }else{
            for(int i=1;i<=exponent;i++){
            powerResult*=base;
            //System.out.println("Result of "+base+ "power" + exponent+" is "+ powerResult);
            
            }
            return powerResult;
        
        }
        
    }

    //method to calculate squareroot
    public double squareRoot(double num){
        return Math.sqrt(num);
    }

}
