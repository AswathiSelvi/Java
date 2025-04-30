package ifelse;
import java.util.Scanner;
public class ie1 {
    
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        if(n%2==0){
            System.out.println("the given number is even");

        }
        else{
            System.out.println("the given number is odd");

        }
        scan.close();
    }
}
