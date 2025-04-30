package whileloop;
import java.util.Scanner;
public class w4 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int sum=0;
        while(num>=0){
            sum +=num;
            System.out.print("Enter a number:");
            num = scan.nextInt();
        }
        System.out.println("sum="+sum);
        scan.close();




        


        }

    }
    

