package oop.labor06.lab6_1;

public class BankAccount {
    public String PREFIX;
    public static final int ACCOUNT_NUMBER_LENGHT = 10;
    private static int numAccounts = 0;
    private String accountNumber;
    private double balance;

    public BankAccount(String nr){
        ++ numAccounts;
        this.accountNumber = createAccountNumber();
    }
    private String createAccountNumber(){
        //
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
