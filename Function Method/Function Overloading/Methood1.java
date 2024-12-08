import java.util.Scanner;

public class Methood1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input (not used here, but ready for future expansion)
        Scanner input = new Scanner(System.in);

        // Initialize some integer and character variables
        int a = 10, b = 20, z = 30; // Three integers
        char x = 'A', y = 'a'; // Two characters ('A' and 'a')

        // Call the overloaded 'larger' methods and display the results
        System.out.println(larger(a, b));      // Calls the method that compares two integers
        System.out.println(larger(x, y));      // Calls the method that compares two characters
        System.out.println(larger(a, b, z));   // Calls the method that processes three integers
    }

    // Method to return the larger of two integers
    public static int larger(int x, int y) {
        // Compare x and y; return the larger value
        if (x > y) return x;
        else return y;
    }

    // Method to return the larger of two characters
    public static char larger(char x, char y) {
        // Compare x and y based on their Unicode values; return the larger character
        if (x > y) return x;
        else return y;
    }

    // Method to process three integers (in this case, returns their sum)
    public static int larger(int x, int y, int z) {
        // Return the sum of the three integers
        return x + z + y;
    }
}
