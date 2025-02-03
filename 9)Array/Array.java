import java.util.Scanner; // Import the Scanner class to read user input

class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the size of the array
        System.out.println("Enter Size of Array:");
        int size; 
        size = input.nextInt(); // Read the size of the array from the user

        // Declare an array of doubles to store employee salaries with the specified size
        double[] salaries = new double[size]; 
        
        // Loop to collect salary inputs from the user
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Enter Salary For employee No: " + (i + 1)); // Prompt for each employee
            salaries[i] = input.nextDouble(); // Store the salary in the array
        }

        double sum = 0; // Initialize a variable to calculate the sum of salaries

        // Loop to calculate the total sum of salaries
        for (int i = 0; i < salaries.length; i++) {
            sum += salaries[i]; // Add each salary to the total sum
        }
        
        // Print the total sum of salaries
        System.out.println("The sum of salary is " + sum);

        // Calculate and print the average salary
        System.out.println("The average of salary is " + sum / salaries.length);
    }
}
