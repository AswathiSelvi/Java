import java.util.Scanner;
public class hypo {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the a^2");
        double a= scan.nextDouble();
        System.out.println("Enter the b^2");
        double b = scan.nextDouble();
        double c = Math.sqrt(Math.pow(a,2)) +(Math.pow(b,2)) ;
        System.out.println(c);
        scan.close();

    
    }
    
    
}
