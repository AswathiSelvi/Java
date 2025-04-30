// Palindrome Triangle pattern//

import java.util.Scanner;
public class p14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){ 
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){//print decreasing numbers
                System.out.print(j +" ");
            }
            for(int j=2;j<=i;j++){//print increasig numbers
               System.out.print(j +" "); 

            }
            System.out.println();
        }
        scan.close();
    }
}
