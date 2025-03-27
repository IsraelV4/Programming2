package Labs.lab04MathAndInheritence;

public class Savings extends Accounts {
    double limit;

    Savings(double bal, double limit) {
        super(bal);
        this.limit = limit;
    }

    void Deposit(double n) {
        balance+=n;
    }

    void Withdrawal(double n) {
        if (balance>=n && n<=limit) {
            balance-=n;
        }
        else {
            System.err.println("Cannot withdraw that amount, error. Canceling Transaction");
        }
    }
}
