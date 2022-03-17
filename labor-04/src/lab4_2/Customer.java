package lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private BankAccount account;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getNumAccounts(String BankAccount){
        return accounts.size();
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
    //for(int i= 0; i< accounts.size(); ++1){
   //     Account account + account.get(i);
   // }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<accounts.size(); ++i){
            result.append( "\t" + accounts.get(i).toString() +"\n");
        }
        return result.toString();
    }
}

