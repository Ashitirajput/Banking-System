import java.util.Scanner;
public class Bank{
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public Bank(String name, String accNo) {
        this.accountHolderName = name;
        this.accountNumber = accNo;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Amount deposited successfully.");

        } else{
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;

            System.out.println("Amount withdraw successfully.");
        } else{
            System.out.println("Insufficient balance.");
        }
    }
    public void checkBalance(){
        System.out.println("AccountHolder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Current Balance: "+balance);
    }
}