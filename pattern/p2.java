import java.util.Scanner;
public class p2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();

        /*
         **
         *** 
         ****  */

        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /* **** 
           ***
           **
           *
         */
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /* 1
         * 22
         * 333
         * 4444
         */
        /*for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }*/

        /* 1
         * 12
         * 123
         * 1234
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
