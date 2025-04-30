//Hollow Hourglass pattern//

import java.util.Scanner;
public class p21 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        //upper pattern//
        for(int i=1;i<=n;i++){
            //Print spaces//
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //Printing stars and hallow spaces//
            for(int j=1;j<=n-i+1;j++){
                if(i==1 || j==1||j==n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }    
            }
            System.out.println();
        }
        //lower pattern
        for(int i=1;i<n;i++){
            //print spaces//
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            //print stars and hollow spaces//
            for(int j=1;j<=i+1;j++){
                if(i==n-1|| j==1||j==i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
        scan.close();
    }
}