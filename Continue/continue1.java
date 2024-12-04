//! Continue StateMent
import java.util.Scanner;

class continue1 {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        int sum = 0, num;
        
        System.out.println("Smart Calculator (:");

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Enter a positive  Integer number "+counter+":");
            num = pop.nextInt();

            if (num < 0) {
                System.out.println("Only positive Integer numbers are allowed. Try again:");
                counter--; // To Try Again
                continue;
            }

            sum += num; 
        }

        System.out.println("Sum of positive numbers is: " + sum);
    }
}
