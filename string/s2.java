package string;
import java.util.Scanner;
public class s2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your email:");
        String email = scan.nextLine();
        if(email.contains("@")){
            String username = email.substring(0,email.indexOf("@"));
            String domain= email.substring(email.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);

        }
        else{
            System.out.println("please enter the valid email");
        }
        
        scan.close();



    }
    
}
