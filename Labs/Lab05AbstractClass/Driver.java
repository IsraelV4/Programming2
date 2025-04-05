package Labs.lab05AbstractClass;

public class Driver {

    public static void main(String[] args) {
        TA a = new TA("Intern", "12345", "June 5", 50, 500);
        TA b = new TA("Intern2", "12345", "June 5", 42, 500);

        Professor c = new Professor("Prof", "12345", "June 5", 42, 500);
        Professor d = new Professor("Prof2", "12345", "June 5", 42, 500);

        Employee[] arr = new Employee[] {a,b,c,d};
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                System.out.println("Does employee " + i + " have the same days off as employee" + j + "?: " + arr[i].sameDayOff(arr[j]));
            }
            for (int j=i+1; j<arr.length; j++) {
                System.out.println("Does employee " + i + " have the same pay as employee" + j + "?: " + arr[i].samePay(arr[j]));
            }
            System.out.println();
            System.out.println();
        }
    }
    

    
}
