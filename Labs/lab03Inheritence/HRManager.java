package Labs.lab03Inheritence;
import java.util.*;

public class HRManager extends Employee {

    ArrayList<String> noofEmployeeAdded;

    public HRManager(int Salary, String WorkingHours, String DateOfEmployment, String EmployeeNumber, ArrayList<String> NoofEmployeeAdded, String Work) {
        super(Salary, WorkingHours, DateOfEmployment, EmployeeNumber, Work);
        noofEmployeeAdded = NoofEmployeeAdded;
    }

    public String work() {
        return work + " Definitely not working";
    }

    public void addnoofEmployeeAdded(String employee) {
        noofEmployeeAdded.add(employee);
    }

    public String getemployeeAdded() {
        return noofEmployeeAdded.get(noofEmployeeAdded.size()-1);
    }

    public String toString() {
        return super.toString() + "\nemployeesAdded: " + noofEmployeeAdded;
    }
    
}
