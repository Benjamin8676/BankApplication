package bankapp;

public class Account {
    private double balance;
    private int accountNo;

    public Account(double balance, int accountNo) {
        this.balance = balance;
        this.accountNo = accountNo;
    }
    
    public boolean withdraw(double amount){
        if(balance >= amount)
            balance-= amount;
        else return false;
        return true;
    }
    
    public boolean deposit(double amount){
        balance+= amount;
        return true;
    }
    
    public double checkBalance(){
        return balance;
    }
}
