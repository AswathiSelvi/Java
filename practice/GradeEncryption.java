//import java.util.Scanner;
/*public class number{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the integer:");
        int num = scan.nextInt();
        boolean isInteger= true;
        System.out.println(isInteger);
    }
}*/
public class GradeEncryption {
    public static void main(String[] args) {
        char grade = 'B'; // Original grade
        char encryptedGrade = (char) (grade + 8); // Encrypting the grade
        char decryptedGrade = (char) (encryptedGrade - 8); // Decrypting the grade

        System.out.println("Original Grade: " + grade);
        System.out.println("Encrypted Grade: " + encryptedGrade);
        System.out.println("Decrypted Grade: " + decryptedGrade);

    }
}
