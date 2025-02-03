import java.util.Scanner; // Import the Scanner class to enable reading user input

// Define a public class to calculate the sum of even and odd numbers
public class sum_even_odd { 
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in); // Create a Scanner object named 'pop' for user input
        int number, sum_even = 0, sum_odd = 0, counter = 0; // Initialize variables

        // Start a for loop to read 10 numbers from the user
        for (; counter++ <= 9;) { 
            System.out.println("Enter your Number " + "(" + counter + ")"); // Prompt the user to enter a number
            number = pop.nextInt(); // Read the user's input and store it in 'number'

            if (number % 2 == 0) { 
                // Check if the number is even
                sum_even += number; // Add the even number to the 'sum_even'
            } else { 
                // If the number is odd
                sum_odd += number; // Add the odd number to the 'sum_odd'
            }
        }

        // Display the total sum of even numbers
        System.out.println("The sum of even numbers: " + sum_even);
        // Display the total sum of odd numbers
        System.out.println("The sum of odd numbers: " + sum_odd);
    }
}
