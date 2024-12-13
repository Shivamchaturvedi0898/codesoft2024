import java.util.Scanner;

public class Twos complement {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a decimal number
        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();
        
        // Find the 2's complement by inverting all bits and adding 1
        int twosComplement = ~number + 1;
        
        // Display the result
        System.out.println("The 2's complement of " + number + " is: " + twosComplement);
        
        // Close the scanner
        scanner.close();
    }
}