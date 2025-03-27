package Labs.lab04MathAndInheritence;

public class Checkings extends Accounts {
    double draft;

    Checkings(double bal, double draft) {
        super(bal);
        this.draft = draft;
    }

    void Deposit(double n) {
        balance+=n;
    }
    void Withdrawal(double n) {
        balance-=n;
        if (balance<0) {
            balance-=draft;
            System.out.println("Overdraft fee of $"+draft+" has been posted to the account");
        }
    }

}
