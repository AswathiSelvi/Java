// Reverse Number triangle pattern//

import java.util.Scanner;
public class p12 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
