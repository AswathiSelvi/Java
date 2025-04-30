package nestedif;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the nationality:");
        String nation = scan.nextLine();
        if(age >=18){
            if(nation.equalsIgnoreCase("Indian")){
                System.out.println("you are eligible to vote ");
            }
            else{
                System.out.println("you are not an indian ");

            }
        }
        else{
           
            System.out.println("you are under 18.So can't vote . sorry!");
        }
        scan.close();

    }
}

