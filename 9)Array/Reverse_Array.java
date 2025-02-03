import java.util.Collections;
import java.util.Scanner; // Import the Scanner class to read user input

class Reverse_Array {

    public static void swap (int arr[], int s, int e)
    {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        int [] arr = new int [5];

        for (int i = 0; i < 5; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("Array Before Reversing: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int s = 0;
        int e = 4;

        while (s <= e)
        {
            swap(arr, s, e);
            s++;
            e--;
        }

        System.out.println("\n Array After Reversing: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
