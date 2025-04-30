package whileloop;
import java.util.Random;
import java.util.Scanner;
public class w1 {
    public static void main(String [] args){
        Random rant = new Random();
        int newnum=0;
        while( newnum!=5){
            newnum=rant.nextInt(11);
            System.out.println(newnum);
        }
    }
    
}
