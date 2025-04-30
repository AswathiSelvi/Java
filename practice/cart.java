
//Shopping Cart//

import java.util.Scanner;
public class cart{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What item would you like to buy?:");
        String item = scan.nextLine();
        System.out.print("What is the price for each?:");
        double price = scan.nextDouble();
        System.out.print("How many would you like?:");
        int like = scan.nextInt();
        System.out.println("you have bought:"+like);
        System.out.println("your total is:"+price*like);
        scan.close();





    }
}
