package whileloop;
import java.util.Scanner;
public class w2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N= scan.nextInt();
        int i=1;
        while(i <=N){
            System.out.println(i+"  ");
            i++;
        }
        scan.close();

    }
    
}
