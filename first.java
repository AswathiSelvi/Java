import java.util.Scanner;
public class first{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :");
        int a = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("my name is "+name+" and the roll number is "+ a);
        scan.close();
        
    }
}