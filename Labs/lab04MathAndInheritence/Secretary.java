package Labs.lab04MathAndInheritence;

public class Secretary extends Person {
    String ID;
    int Serv, Sal, num;

    Secretary() {
        ID = "";
        Serv = 12;
        Sal = 6;
        num = 1;
    }

    String getPaid() {
        return Sal+"k every two weeks";
    }


    String getVacation() {
        return num+"Months";
    }
}
