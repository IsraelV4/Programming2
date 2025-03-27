package Labs.Lab06ErrorHandling;


 	

/*
In this lab, we aim at writing an exception class by ourselves which inherits from the generalized Exception class.
More specifically, you should define an exception class which can capture at least three different exceptional cases 
for a bank account (such as deposit/withdraw negative amount, overdraft, opening the account with zero balance, etc.). 
Also define a bank account class with a main method, in which you will create a bank account example and demonstrate 
how your own exception class could help handle those different types of exceptions.
*/


public class myException extends Exception {
    public myException(String message) {
        super(message);
    }
    
}
