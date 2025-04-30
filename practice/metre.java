import java.util.Scanner;
public class metre{
    public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    System.out.println("convert kilometres to metres");
    System.out.println("Enter the number");
    int kilometre= scan.nextInt();
    int result = kilometre * 1000;
    System.out.println("the result is :"+result);
    scan.close();




}}