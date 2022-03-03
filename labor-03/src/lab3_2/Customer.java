package lab3_2;

import oop.labor03.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;
    public static final int MAX_ACCOUNTS = 10;
    private int newAccount;
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    public void addAccount (BankAccount account){

    }
    public BankAccount getAccount(String accountNumber){
        //if()
        return account;
    }

    public Customer(String firstName, String lastName) {
    this.firstName=firstName;
    this.lastName=lastName;

    }
    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public BankAccount getAccount() {
        return account;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(){
        account = null;
    }
    public String toString(){
        return firstName+" "+lastName+" "+account;
    }
}
