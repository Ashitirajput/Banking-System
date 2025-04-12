import java.util.Scanner;

public class Main {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to Simple Banking System ===");
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter account number:");
        String accNo = sc.nextLine();
        Bank user = new Bank(name,accNo);
        int choice;
        do{
            System.out.println("\n1.Deposit");
            System.out.println("2.withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Choose an option:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.print("Enter amount to deposit:");
                double depAmt = sc.nextDouble();
                user.deposit(depAmt);
                break;
                case 2:
                System.out.print("Enter amount to withdraw:");
                double withAmt = sc.nextDouble();
                user.withdraw(withAmt);
                break;
                case 3:
                user.checkBalance();
                break;
                case 4:
                System.out.println("Thank you for using our banking system.");
                break;
                default:
                System.out.println("Invalid option.");

            }
              
        } 
          while(choice != 4);
          sc.close();
    }
    
}
