//Diamond pattern//

import java.util.Scanner;
public class p15 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){ 
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i)*2-1;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }

        scan.close();
    }
}

