import java.util.*;
public class Manager extends Employee {
    private LinkedList<Employee> employees ;
    public Manager (String firstName, String lastName, int yearOfBirth, int year, int salary, String insuranceNumber, LinkedList<Employee> employees){
        super(firstName, lastName,yearOfBirth, year, salary, insuranceNumber);
        this.employees=employees;
    }
    public Manager (String firstName, String lastName, int yearOfBirth, int year, int salary, String insuranceNumber){
        super(firstName, lastName,yearOfBirth, year, salary, insuranceNumber);
        employees = new LinkedList<Employee>() ;
    }
    public void addEmployee (Employee employee){
        employees.add(employee);
    }
    public boolean equals(Manager manager){
        return(super.equals(manager) && employees.containsAll(manager.employees) && manager.employees.containsAll(employees));
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nTeam:");
        for (int i = 0 ; i<employees.size(); i ++){
            sb.append("\n" +employees.get(i).toString());
        }
        return sb.toString();
    }
    public void giveBonus (int bonus){
        this.salary+=bonus;
    }
}
