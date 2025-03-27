package Labs.lab04MathAndInheritence;

public class Student_Worker extends Person{
    String ID, year, Course;
    int Sal, num;

    Student_Worker() {
        ID = "";
        year = "Fresh";
        Course = "Math";
        Sal = 20;
        num = 2;
    }

    String getPaid() {
        return Sal+" Dollars per hour";
    }

    String getVacation() {
        return num+" Days off a week, on the weekends";
    }
}
