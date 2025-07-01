import java.util.Scanner;
public class fact {
    void factorial(){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int fact=1,sum=0;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        sum+=fact;
        System.out.println("the factorial of "+a+" is: "+fact);
        System.out.println("the sum of factorial is: "+sum);
        scan.close();


    }
    public static void main(String [] args){
        fact num1= new fact();
        num1.factorial();
    }
    




    
}
