package Labs.lab03Inheritence;

public class Administrative extends Employee {

    String studentsAdministered;

    public Administrative(int Salary, String WorkingHours, String DateOfEmployment, String EmployeeNumber, String StudentsAdministered, String Work) {
        super(Salary, WorkingHours, DateOfEmployment, EmployeeNumber, Work);
        studentsAdministered = StudentsAdministered;
    }

    public String work() {
       return work + " Really not working as much";
    }

    public String getstudentAdministered() {
        return studentsAdministered;
    }

    public String toString() {
        return super.toString() + "\nstudentAdministered: " + studentsAdministered;
    }
    
}
