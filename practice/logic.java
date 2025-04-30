import java.util.Scanner;
public class logic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String username= scan.nextLine();
        if(username.length() <4 || username.length()  >12){
            System.out.println("usemername must between 4 to 12 char");    
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username should not contain space or under score");
        }
        else{
            System.out.println(" hello! welcome "+username);
           
        }
        
        scan.close();

    }

    
}
