import java.util.Scanner; 

public class Array_Method {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompt the user to enter the size of the array
        System.out.println("Enter your size of array");
        int size = input.nextInt();
        
        // Initialize an array with the specified size
        int[] ids = new int[size];
        
        // Call the method to fill the array with user input
        fillarray(ids);
        
        // Call the method to print the elements of the array
        printarray(ids);

        // Ask the user for an ID to search in the array
        System.out.println("Enter the id to Search for:");
        int Searchids = input.nextInt();
        
        // Search for the specified ID and store the index
        int return_Index = Search(ids, Searchids);

        // Check if the item was found and display the appropriate message
        if (return_Index >= 0) {
            System.out.println("The item is found");
        } else {
            System.out.println("The item is not found");
        }
    }

    // Method to fill the array with user input
    public static void fillarray(int[] list) {
        // Loop through each element of the array
        for (int i = 0; i < list.length; i++) {
            // Prompt the user to enter a value for each index
            System.out.println("Enter No " + (i + 1));
            list[i] = input.nextInt();
        }
    }

    // Method to print all elements of the array
    public static void printarray(int[] list) {
        // Loop through the array and print each element
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    // Method to search for a target value in the array
    public static int Search(int[] list, int target) {
        // Loop through the array to find the target
        for (int i = 0; i < list.length; i++) {
            // If the target is found, return its index
            if (list[i] == target)
                return i;
        }
        // Return -1 if the target is not found
        return -1;
    }
}
