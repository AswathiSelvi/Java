import java.util.Scanner;
public class weight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight ;
        double newweight;
        int choice;

        System.out.println("weight conversion prohram");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert lbs to kgs");
        System.out.print("choose an option:");
        choice = scan.nextInt();
        if(choice==1){
            System.out.println("Enter the weight in lbs:");
            weight = scan.nextDouble();
            newweight=weight*0.453592;
            System.out.printf("weight in kgs:%.2f",newweight);
        }
        else if(choice==2){
            System.out.println("Enter the weight in kgs:");
            weight = scan.nextDouble();
            newweight=weight*2.20462;
            System.out.printf("weight in lbs:%.2f",newweight);

        }
        else{ 
            System.out.println("not a valid choice");
        }
        scan.close();



        

    }
    
}
