//Square Hallow Pattern//

import java.util.Scanner;
public class p6 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0||i==n||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");

            }
          
        }
        System.out.println();
   
    }
    scan.close();
}
}
