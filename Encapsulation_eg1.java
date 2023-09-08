import java.util.Scanner;

public class Encapsulation_eg1{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();
    
    System.out.println("Employee id: ");
    employee.setEmployeeId(sc.nextInt());

    System.out.println("Employee Name: ");
    employee.setEmployeeName(sc.next());

    System.out.println("Employee Salary: ");
    employee.setEmployeeSalary(sc.nextInt());

    System.out.println("Employee Name:- "+ employee.getEmployeeId()+ " Employee Name :-" +employee.getEmployeeName() + " Employee Salary:-" + employee.getEmployeeSalary());
    sc.close(); 

}

}
 class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_salary;


    public int getEmployeeId(){
        return employee_id;
    }

    public String getEmployeeName(){
        return employee_name;
    }

    public int getEmployeeSalary(){
        return employee_salary;
    }

    public void setEmployeeId(int employee_id){
        this.employee_id = employee_id;
    }

    public void setEmployeeName(String employee_name){
        this.employee_name =employee_name;
    }

    public void setEmployeeSalary(int employee_salary ){
        this.employee_salary = employee_salary;
    }

}