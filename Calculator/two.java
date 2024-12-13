import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();
       
        int twosComplement = ~number + 1;
        
      
        System.out.println("The 2's complement of " + number + " is: " + twosComplement);
        
  
        scanner.close();
    }
}