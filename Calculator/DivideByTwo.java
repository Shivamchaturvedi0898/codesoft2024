import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        double result = decimalNumber / 2;
        
        // Display the result
        System.out.println("The result after dividing the number by 2 is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}