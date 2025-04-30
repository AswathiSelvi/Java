package nestedif;
import java.util.Scanner;

public class withdraw{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int balance = 5000; 
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        
        if (amount > 0) {                     
            if (amount <= balance) { 
                if (amount % 100 == 0) { 
                    balance -= amount;
                    System.out.println("Transaction successful!");
                    System.out.println("Remaining balance: ₹" + balance);
                } else {
                    System.out.println("Invalid amount (ATM dispenses in multiples of ₹100 only).");
                }
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
        
        sc.close();
    }
}
