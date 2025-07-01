import java.util.Scanner;
public class evenodd {
    Scanner scan =new Scanner(System.in);
    int a=scan.nextInt();
   
    void checkevenodd(){
        if(a%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }

    }
     public static void main(String[] args) {
        evenodd num1 = new evenodd();
        num1.checkevenodd();
    }   
}
