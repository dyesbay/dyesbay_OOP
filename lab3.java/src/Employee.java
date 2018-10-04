public class Employee extends Person {
    protected int year;
    protected int salary;
    protected String insuranceNumber;
    public Employee (String firstName, String lastName, int yearOfBirth, int year, int salary, String insuranceNumber){
        super(firstName, lastName,yearOfBirth);
        this.year=year;
        this.salary=salary;
        this.insuranceNumber=insuranceNumber;
    }
    public boolean equals (Employee employee){
        return (super.equals(employee) && this.year==employee.year && this.salary==employee.salary && this.insuranceNumber.equals(employee.insuranceNumber));
    }
    public String toString(){
        return (super.toString()+", works since " + year + ", has salary $" + salary );
    }
}
