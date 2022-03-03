package oop.labor03;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Jhon", "BLACK");
        System.out.println(customer1.toString());
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP001"));
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary", "WHITE");
        System.out.println(customer2);
        customer2.setAccount(new BankAccount("OTP002"));
        customer2.getAccount().deposit(500);
        customer2.closeAccount();
        System.out.println(customer2.toString());
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1.toString());
        customer1.getAccount().deposit(500);
        System.out.println(customer1);
        customer2.getAccount().withdraw(250);
        System.out.println(customer1);



    }
}
