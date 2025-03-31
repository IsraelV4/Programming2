package Day1;
public class Account {
    public double Capital, Rate;
    public int Term;

    public double Compute_Balance() {
        return Math.pow(1+Rate, Term) * Capital;
    }
}