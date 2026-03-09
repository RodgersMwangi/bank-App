package Assignment.javase010.Quizes;

/* QUIZ 2 */

public class Manager extends Employee{
    //constructor
    public Manager(String name, String id, double salary){
        super(name,id,salary);
    }

    //overriden calculate bonus method
    @Override
    public double calculateBonus(){
        if(!error){
            return 0.15*salary;
        }
        return 0;
    }

}
