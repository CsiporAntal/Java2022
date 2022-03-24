package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Customer {
    private int numCustomers;
    private int id=1;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private BankAccount account;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public int getNumCustomers() {
        return numCustomers;
    }
    public int getNumAccounts(String BankAccount){
        return accounts.size();
    }
    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
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

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<accounts.size(); ++i){
            result.append( "\t" + accounts.get(i).toString() +"\n");
        }
        return result.toString();
    }
}

