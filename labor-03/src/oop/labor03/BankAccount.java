package oop.labor03;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String nr){
        accountNumber = nr;
    }
    public  double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double amount){
        balance = amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance)
        {balance -= amount;
            return true;}
        return false;
    }
    public String toString(){
        return balance+" "+accountNumber;
    }


}
