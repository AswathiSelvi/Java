//Hotel Menu System – Take user input for menu items (Pizza, Burger, Pasta, etc.) and display the price.//
import java.util.Scanner;

class HotelMenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hotel Menu System!");
        System.out.println("Menu:");
        System.out.println("1. Pizza - $12");
        System.out.println("2. Burger - $8");
        System.out.println("3. Pasta - $10");
        System.out.println("4. Sandwich - $6");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Pizza. Price: $12");
                break;
            case 2:
                System.out.println("You selected Burger. Price: $8");
                break;
            case 3:
                System.out.println("You selected Pasta. Price: $10");
                break;
            case 4:
                System.out.println("You selected Sandwich. Price: $6");
                break;
            case 5:
                System.out.println("Thank you! Have a great day.");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid menu item.");
        }

        scanner.close();
    }
}

