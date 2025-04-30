
import java.util.Scanner;
public class mark {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("MARKS OF THREE SUBJECT");
        System.out.print("enter the maths mark : ");
        int maths = scan.nextInt();
        System.out.print("enter the physics mark : ");
        int physics = scan.nextInt();
        System.out.print("enter the chemistry mark : ");
        int chemistry = scan.nextInt();
       double total = (maths + physics + chemistry);
       double cgpa = total/300;
        System.out.println("your cgpa of out  100 is :"+cgpa*100+"/100");
        scan.close();




    }
    
}
