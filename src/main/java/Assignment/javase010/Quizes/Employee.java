package Assignment.javase010.Quizes;

/*QUIZ 2 */

public class Employee {
    private String name;
    private String id;
    protected double salary;
    protected boolean error;

    //constructor
    public Employee(String name, String id, double salary){
        setName(name);
        setId(id);
        setSalary(salary);
        
    }

    //setters and getters
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Name cannot be empty");
            error=true;
        }else{
            this.name=name;
        }
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        if(id.length()<7 || id.length()>7){
            System.out.println("Id must be 7 characters long");
            error=true;
        }else{
            this.id = id;
        }
        
    }
    public String getId() {
        return id;
    }
    public void setSalary(double salary) {
        if(salary<=0){
            System.out.println("Salary cannot be a negative number or zero");
            error=true;
        }else{
            this.salary = salary;
        }
        
    }
    public double getSalary() {
        return salary;
    }

    //methods
    public double calculateBonus(){
        if(!error){
            return 0.05*salary;
        }
        return 0;
    }
    public void displayInfo(){
        if(!error){
            System.out.println("=========================================");
            System.out.println("Name: "+name+"\nId: "+id+"\nSalary: "+salary+"\nBonus:"+calculateBonus());
            System.out.println("=========================================");
        }

    }

}
