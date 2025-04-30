import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st num: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the 2nd num: "); 
        double num2 = scan.nextDouble();

        System.out.print("Enter the operator ('+','-','*','/','^'): ");
        char operator = scan.next().charAt(0);

        double result = 0; 

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break; 

            case '*':
                result = num1 * num2;
                break; 

            case '/':
                if (num2 != 0) {  
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scan.close();
                    return;
                }
                break; 

            case '^':
                result = Math.pow(num1, num2);
                break; 

            default:
                System.out.println("Error: Invalid operator!");
                scan.close();
                return; 
        }

        System.out.println("Result: " + result);
        scan.close();
    }
}
