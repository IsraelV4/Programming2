package Labs.Lab06ErrorHandling;
import java.util.*;

public class bankAccount {
    int bal, wLim;

    public bankAccount(int balance, int withdrawLimit) throws myException {
        bal = balance;
        wLim = withdrawLimit;
        if (bal<=0) {
            throw new myException("Cannot create a bank account with a balance of 0 or lower. Please try again");
        }
    }

    public void withdraw(int amount) throws myException {
        if (amount>wLim) {
            throw new myException("Withdraw amount(" + amount + ") is greater than amount allowed(" + wLim + ")");
        }
        else if (amount<0) {
            throw new myException("Cannot withdraw negative amount (" + amount +")");
        }
        else if (amount>bal) {
            throw new myException("Amount withdrawn(" + amount + ") is greater than amount of available money in balance(" + bal + ")");
        }
        bal-=amount;
    }

    public void deposit(int amount) throws myException {
        if (amount<0) {
            throw new myException("Cannot deposit a negative amount of money");
        }
        bal+=amount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tmp = "";
        bankAccount a = null;
        
        while (!tmp.equals("quit")) {
            try {
                System.out.println("What would you like to do with your account today?");
                System.out.println("please enter: 'withdraw', 'create account', or 'deposit");
                tmp = input.nextLine();
                if (tmp.equals("create account")) {
                    System.out.println("How big is your balance?");
                    int bal = Integer.parseInt(input.nextLine());
                    System.out.println("How big is your withdraw limit?");
                    int wLim = Integer.parseInt(input.nextLine());
                    a = new bankAccount(bal, wLim);
                }
                else if (tmp.equals("deposit")) {
                    System.out.println("How much would you like to deposit?");
                    a.deposit(Integer.parseInt(input.nextLine()));
                }
                else if (tmp.equals("withdraw")) {
                    System.out.println("How much would you like to withdraw?");
                    a.withdraw(Integer.parseInt(input.nextLine()));
                }
            }
            catch (myException e) {
                System.err.println(e);
            }
        }
        input.close();
    }
}
