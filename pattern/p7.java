//number changing pyramid pattern//

import java.util.Scanner;
public class p7 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num +" " );
                num++;
            }
            System.out.println("  ");

        }
        scan.close();
    }
}