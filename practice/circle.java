import java.util.Scanner;
public class circle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius =scan.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("AREA OF CIRCLE : "+area);
        double circum = 2* Math.PI *radius;
        System.out.println("CIRCUMFERENCE  OF CIRCLE: "+circum);
        double sphere = (4.0/3.0)* Math.PI * Math.pow(radius,3);
        System.out.println("VOLUME  OF SPHERE: "+sphere);
        scan.close();


        

    }
}