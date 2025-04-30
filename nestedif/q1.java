package nestedif;

public class q1 {
    public static void main (String[] args){
        boolean isStudent = false;
        boolean isSenior = true ;
        double price = 99.9;
        if(isStudent){
            if(isSenior){
                System.out.println("you grt a senior discount of 20%");
                System.out.println("you grt a student discount of 10%");
                price *= 0.7;     

            }
            else{

                System.out.println("you grt a student discount of 10%");
                price *= 0.9;
            }
            
        }
        else{
            if(isSenior){
                System.out.println("you grt a senior discount of 20%");
                price *= 0.8;

            }
            else{
                price *=1;
            }
        }
        System.out.printf("the price of the ticket is: $%.2f",price);
        
    }
    

    
}
