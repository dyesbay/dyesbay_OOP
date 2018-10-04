import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EmployeeTest {

    private Scanner reader = new Scanner(System.in);
    private Employee readEmployee(){
        String firstName = reader.next();
        String lastName = reader.next();
        int yearOfBirth = reader.nextInt();
        int year = reader.nextInt();
        int salary = reader.nextInt();
        String insuranceNumber = reader.next();
        return new Employee(firstName,lastName,yearOfBirth,year,salary,insuranceNumber);
    }
    public void run(){
        Employee temp = readEmployee();

        Manager manager1 = new Manager(temp.firstName, temp.lastName,temp.yearOfBirth, temp.year, temp.salary, temp.insuranceNumber) ;
        int n = reader.nextInt();
        for (int i=0; i<n; i++){
            manager1.addEmployee(readEmployee());
        }
        temp = readEmployee();
        Manager manager2 = new Manager(temp.firstName, temp.lastName,temp.yearOfBirth, temp.year, temp.salary, temp.insuranceNumber) ;
        n = reader.nextInt();
        for (int i=0; i<n; i++){
            manager2.addEmployee(readEmployee());
        }
        System.out.println((manager1).equals((manager2)));
        System.out.println(manager1);
        System.out.println(manager2);
    }
}
