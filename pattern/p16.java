import java.util.Scanner;
public class p16 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        //UPPER PATTERN//
        /*      *     *
         *      **   **
         *      *** ***
         */
        for(int i=1;i<=n;i++){
            //Print left stars//
            /*      *
             *      **
             *      ***
             */
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Print spaces//
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            //Print right stars//
            /*        *
             *       **
             *      ***
             */
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pattern//
        for(int i=1;i<=n;i++){
            //left stars//
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            //spaces//
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            //right stars//
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
                
           
     scan.close();       
        
       
    }
}

