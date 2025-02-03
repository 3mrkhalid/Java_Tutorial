import java.util.Scanner; // Import the Scanner class to enable reading user input

//! Random Game
class Project1 {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in); // Create a Scanner object named 'pop' for user input

        int guess, rand; // Declare variables to store the user's guess and the random number
        rand = (int)(Math.random() * 100); // Generate a random integer between 0 and 99
        boolean still_playing = true; // Initialize a flag to keep the game running

        // Uncomment the next line to display the random number for debugging
        // System.out.println("Number is " + rand); 

        // Start of the game loop, runs until the user guesses the correct number
        while (still_playing) {
            System.out.println("Enter number between 0 and 100"); // Prompt the user to guess
            guess = pop.nextInt(); // Read the user's input and store it in 'guess'

            if (guess > rand) { 
                // Check if the user's guess is greater than the random number
                System.out.println("Guess too large"); // Notify the user their guess is too high
            } else if (guess < rand) { 
                // Check if the user's guess is less than the random number
                System.out.println("Guess too small"); // Notify the user their guess is too low
            } else { 
                // If the user's guess matches the random number
                System.out.println("You Win"); // Congratulate the user
                still_playing = false; // Set the flag to false to end the loop
            }
        }
    } // End of the main method
} // End of the class
