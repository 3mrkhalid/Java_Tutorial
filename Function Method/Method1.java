import java.util.Scanner; // Import the Scanner class to enable reading input from the user

public class Method1 {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in); // Create a Scanner object named 'pop' to read input from the user
        System.out.println("Welcome To Market");
        
        // Call the drawline method with any character and integer as an argument
        drawline('*',10);
        
        System.out.println("Hello");
        
        // Call the drawline method with any character and integer as an argument
        drawline('-', 5);
    } // End of main method

    // Method definition: This method draws a line of repeated characters and integer
    public static void drawline(char chr , int length) {
        int i; // Declare a loop counter variable
        for (i = 0; i <= length; i++) { // Loop to print the character 11 times
            System.out.print(chr); // Print the character without a newline
        }
        System.out.println(); // Move to the next line after printing the line
    } // End of drawline method

} // End of class Method1
