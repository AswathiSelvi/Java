import java.util.Scanner;
public class compound{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double principal;
        double rate;
        int times;
        int year;
        double amount;
         System.out.print(" Enter the principal:");
         principal= scan.nextDouble();

         System.out.print(" Enter the rate:");
         rate= scan.nextDouble()/100;

         System.out.print(" Enter the times:");
         times= scan.nextInt();

         System.out.print(" Enter the year:");
         year= scan.nextInt();

         amount = principal * Math.pow(1 + rate/times,times*year);
         System.out.printf(" the compund interest amount after %d years is $% .1f",year,amount);
         scan.close();
         

    }

}