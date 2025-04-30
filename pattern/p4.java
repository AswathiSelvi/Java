//K pattern//

import java.util.Scanner;
public class p4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=1;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        } 

        scan.close();
   
    }
}
