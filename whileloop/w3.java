package whileloop;
import java.util.Scanner;
public class w3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum +=i;
            i++;
        }
        System.out.println(sum);
        scan.close();
    }
    

}
