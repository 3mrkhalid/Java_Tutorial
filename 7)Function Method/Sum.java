import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner reader = new Scanner(System.in);
        
        // Declare variables to store the numbers, total sum, and average
        int num1, num2, num3, total;
        double average;

        // Prompt the user to enter 3 numbers
        System.out.println("Enter 3 Numbers:");
        num1 = reader.nextInt(); // Read the first number
        num2 = reader.nextInt(); // Read the second number
        num3 = reader.nextInt(); // Read the third number

        // Calculate the total sum of the numbers by calling Calc_sum method
        total = Calc_sum(num1, num2, num3);

        // Calculate the average of the numbers by calling average method
        average = average(num1, num2, num3);

        // Display the results by calling display method
        display(total, average);
    }

    // Method to calculate the sum of three numbers
    public static int Calc_sum(int num1, int num2, int num3) {
        return num1 + num2 + num3; // Return the sum of the three numbers
    }

    // Method to calculate the average of three numbers
    public static double average(int n1, int n2, int n3) {
        // Call Calc_sum to get the total and divide by 3 to calculate the average
        return Calc_sum(n1, n2, n3) / 3.0; // Use 3.0 to ensure the result is a double
    }

    // Method to display the sum and average
    public static void display(int s, double a) {
        // Print the total sum
        System.out.println("Sum of Numbers is " + s);

        // Print the average
        System.out.println("Average of Numbers is " + a);
    }
}
