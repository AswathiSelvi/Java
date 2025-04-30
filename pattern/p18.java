//Hollow Triangle Pattern//

import java.util.Scanner;
public class p18 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            //Print spaces//
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Printing stars and hallow spaces//
            for(int j=1;j<=2*i-1;j++){
                if(i==n || j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
    }
}



