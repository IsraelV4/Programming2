package Labs.lab04MathAndInheritence;

public class Accounts {
    double balance;

    Accounts(double bal) {
        balance = bal;
    }

    void Deposit(double n) {
        
    }

    void Withdrawal(double n) {
        
    }

    public static void main(String[] args) {
        Savings s1 = new Savings(1000, 10000);
        Checkings c1 = new Checkings(1000, 100);
        Accounts[] arr = new Accounts[] {s1, c1};

        for (int i=0; i<arr.length; i++) {
            System.out.println("Current Balance: " + arr[i].balance);
            arr[i].Withdrawal(1500);
            System.out.println();
            System.out.println("Current Balance after $1500 withdrawal: " + arr[i].balance);
            arr[i].Deposit(1000); 
            System.out.println("Current Balance after 1000 deposi: " + arr[i].balance);
            System.out.println();
            System.out.println();
        }
    }
}
