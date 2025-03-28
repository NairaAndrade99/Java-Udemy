import java.util.Scanner;
import entities.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();
        
         account = new Account(number,holder);

        System.out.println("Is there na initial deposit (y/n) ? ");
        char val = sc.next().charAt(0);

        if (val == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit);
         

        }else {
           account = new Account(number,holder);
        
        }
        System.out.println(account);
         
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        
        
        System.out.println(account); 

        System.out.println("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println(account);

    }
}
