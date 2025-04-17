package Labs.lab03Inheritence;

import java.util.*;

public class Employee {
    String workingHours, dateOfEmployment, employeeNumber, work;
    int salary;

    public Employee(int Salary, String WorkingHours, String DateOfEmployment, String EmployeeNumber, String Work) {
        salary = Salary;
        workingHours = WorkingHours;
        dateOfEmployment = DateOfEmployment;
        employeeNumber = EmployeeNumber;
        work = Work;
    }

    public String work() {
        return work;
    }

    public int getsalary() {
        return salary;
    }

    public String getworkingHours() {
        return workingHours;
    }

    public String getdateOfEmployment() {
        return dateOfEmployment;
    }

    public String getemployeeNumber() {
        return employeeNumber;
    }

    public String toString() {
        return "Salary: " + salary + "\nWork: " + work() + "\nWorking Hours: " + workingHours + "\ndateOfEmployment: " + dateOfEmployment + "\nEmployeeNumber: " + employeeNumber;
    }

    public static void main(String[] args) {
        Employee a = new Employee(100, "300", "Yesterday", "Numb", "Working");
        Faculty b = new Faculty(200, "200", "Month Ago", "ABC", "Work", "123", "IDK");
        Administrative c = new Administrative(400, "100", "Year Ago", "ABC1234", "ALL", "Slacking");
        HRManager d = new HRManager(500, "10", "Start of Company", "ABCD1234IJK", new ArrayList<String>(), "Mike");

        Employee[] arr = new Employee[] {a,b,c,d};
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+"\n");
        }
    }
}
