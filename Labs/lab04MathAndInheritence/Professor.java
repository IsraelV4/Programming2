package Labs.lab04MathAndInheritence;

public class Professor extends Person {
    String ID, RA;
    int Sal, num;

    Professor() {
        ID = "";
        RA = "";
        Sal = 12;
        num = 3;
    }

    String getPaid() {
        return Sal+"k a Month";
    }

    String getVacation() {
        return num+"3 Months";
    }
}
