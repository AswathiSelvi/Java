package forloop;
import java.util.Scanner;
public class f1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int count=0;
        for( int i=1;i<=num;i++){
            if(i%3==0){
            System.out.println(i);
            count=count+1;
        }
        }
        System.out.println(count);
        scan.close();

    }
}
    