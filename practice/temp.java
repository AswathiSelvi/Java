import java.util.Scanner;
public class temp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature= scan.nextDouble();
        System.out.print("conver to celsius or fahrenheit(C or F): ");
        String unit = scan.next().toUpperCase();
        Double newtemperature = (unit.equals("C")? ((temperature-32)*5/9) : (temperature*9/5)+32);
        System.out.printf("%.1f%s",newtemperature,unit);
        scan.close();

    }
    }
    

