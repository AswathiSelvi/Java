import java.util.Scanner;
public class p5 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ente the input n: ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0 +" ");
                }
                
            }
            System.out.println();
        }
        scan.close();
    }
}