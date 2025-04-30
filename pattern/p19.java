//Hollow reverse triangle  pattern//

import java.util.Scanner;
public class p19 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            //Print spaces//
            for(int j=0;j<=i-1;j++){
                System.out.print(" ");
            }
            //Printing stars and hallow spaces//
            for(int j=1;j<=2*(n-i+1)-1;j++){
                if(i==1 || j==1||j==2*(n-i+1)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
    }
}