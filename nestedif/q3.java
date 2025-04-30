package nestedif;
import java.util.Scanner;
public class q3 {
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a nnumber: ");
        int num = scan.nextInt();
        if(num >=0){
            if(num ==0){
                System.out.println("The given number is Zero!");
            }
            else{
                System.out.println("The given number is positive!");
            }
  
    }
    else{
        System.out.println("The given number is negative!");
    }
    scan.close();


    
}
}