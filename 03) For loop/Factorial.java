package Forloop; // Define the package name
import java.util.Scanner; // Import the Scanner class to enable user input

// Define a class for calculating factorials
class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input
        int factorial = 1, counter, sum = 0, number, j = 1, num; // Initialize variables

        // Prompt the user for the number of factorials they want to calculate
        System.out.println("How Many Factorial You Want:");
        num = input.nextInt(); // Read the number of factorials from the user

        // Loop to calculate factorials for the given number of inputs
        for (; j <= num; j++) {
            System.out.println("Enter your number to get factorial"); // Prompt user for a number
            number = input.nextInt(); // Read the number from the user

            if (number < 0) { 
                // Check if the input is a negative number
                System.out.println("Only positive numbers are allowed"); // Inform user negative numbers are not valid
            } else {
                // Calculate the factorial of the given number
                for (int i = 1; i <= number; i++) {
                    factorial *= i; // Multiply the current value of factorial by i
                }

                // Display the calculated factorial
                System.out.println("Factorial is: " + factorial);

                // Reset the factorial variable to 1 for the next calculation
                factorial = 1;
            }
        }
    } // End of the main method
} // End of the class
