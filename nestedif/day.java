package nestedif;
import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number od the day: ");
        int day= scan.nextInt();
        if(day > 0 && day <=7) {
            if(day==1){
                System.out.println("Monday");
            }
            else if(day==2){
                System.out.println("Tuesday");
            }
            else if(day==3){
                System.out.println("Wednesday");
            }
            else if(day==4){
                System.out.println("Thursday");
            }
            else if(day==5){

                System.out.println("Friday");
            }
            else if(day==6){
                System.out.println("Saturday");
            }
            else{
                System.out.println("Sunday");
            }
            
            }
            else{
                
                    System.out.println("Invalid input");

                }
                scan.close();
            }
        
      
        }   
     
    
