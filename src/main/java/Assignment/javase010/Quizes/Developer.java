package Assignment.javase010.Quizes;

/*QUIZ 2 */

public class Developer extends Employee{

    //constructor
    public Developer(String name, String id, double salary){
        super(name,id,salary);
    }

    @Override
    public double calculateBonus(){
        if(!error){
            return 0.10*salary;
        }
        return 0;
    }


}
