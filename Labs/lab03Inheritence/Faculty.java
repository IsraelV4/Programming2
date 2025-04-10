package Labs.lab03Inheritence;

public class Faculty extends Employee {
    String researchID, facultyNoofClasses;
    public Faculty(int Salary, String WorkingHours, String DateOfEmployment, String EmployeeNumber, String ResearchID, String FacultyNoofClasses, String Work) {
        super(Salary, WorkingHours, DateOfEmployment, EmployeeNumber, Work);
        researchID = ResearchID;
        facultyNoofClasses = FacultyNoofClasses;
    }

    public String work() {
        return work + " Not as much";
    }

    public String getresearchID() {
        return researchID;
    }

    public String getfacultyNoofClasses() {
        return facultyNoofClasses;
    }

    public String toString() {
        return super.toString() + "\nresearchID: " + researchID + "\nfacultyNoofClasses: " + facultyNoofClasses;
    }
    
}
