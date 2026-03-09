/*
Assessment 3: Javase014
Student: Rodgers Mwangi
Date: 1 Feb 2026
Problem 4

Key features
    corrected class EmployeeManagement
*/


package Assignment.javase014.Problem4;

public class EmployeeManagement {
    public static String companyName;
    private String employeeName;
    private double salary;

    public EmployeeManagement(String name, double salary) {
        setEmployeeName(name);
        setSalary(salary);

    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative");
        }else{
            this.salary = salary;
        }
    }

    public void setEmployeeName(String employeeName) {
        if(!employeeName.trim().isEmpty()){
            this.employeeName = employeeName;
        }else{
            System.out.println("Invalid Name");
        }
        
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}
