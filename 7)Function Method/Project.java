import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);

        int option;
        System.out.println("Smart Calculator :)");
        drawline('-', 30);  // Call to print a line for better UI readability

        do {
            // Display menu options for the user
            System.out.println("(1) Sum 2 Numbers");
            System.out.println("(2) Subtract 2 Numbers");
            System.out.println("(3) Divide 2 Numbers");
            System.out.println("(4) Square of a Number");
            System.out.println("(5) Square Root of a Number");
            System.out.println("(6) Factorial of a Number");
            System.out.println("(7) Trigonometric Functions");
            System.out.println("(8) Power of a Number");
            System.out.println("(0) To exit");
            System.out.print("Choose an option: ");
            option = pop.nextInt();  // Get the user's choice

            // Switch case to handle user input and execute corresponding function
            switch (option) {
                case 1:
                    System.out.println("Enter two numbers:");
                    Calc_Sum(pop);  // Calls the method to calculate sum
                    break;

                case 2:
                    System.out.println("Enter two numbers:");
                    Calc_Subtract(pop);  // Calls the method to subtract numbers
                    break;

                case 3:
                    System.out.println("Enter two numbers:");
                    Calc_divid(pop);  // Calls the method to divide numbers
                    break;

                case 4:
                    System.out.println("Enter a number:");
                    Calc_Sqare(pop);  // Calls the method to calculate square
                    break;

                case 5:
                    System.out.println("Enter a number:");
                    Calc_Sqart(pop);  // Calls the method to calculate square root
                    break;

                case 6:
                    Factorial(pop);  // Calls the method to calculate factorial
                    break;

                case 7:
                    Trigonometric(pop);  // Calls the method to handle trigonometric functions
                    break;
                
                case 8:
                    Power_Number(pop);  // Calls the method to handle power calculation
                    break;
                    
                case 0:
                    System.out.println("Good Bye :)");  // Exit message
                    break;

                default:
                    System.out.println("Invalid Value, Try again.");  // Invalid input message
            }
            drawline('*', 40);  // Draws a separator line
        } while (option != 0);  // Continues the loop until the user selects option 0 (exit)
    }

    //! Methods Function
    public static void Factorial(Scanner input) {
        System.out.print("Enter your number: ");
        int num = input.nextInt();  // Get the number to calculate factorial
        if (num < 0) {
            System.out.println("Math Error: Factorial is undefined for negative numbers.");
            return;  // Exit the method if the number is negative
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // Calculate factorial
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    public static void drawline(char ch, int length) {
        // Prints a line of the specified character to create separation in the output
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void Calc_Sum(Scanner input) {
        int num1 = input.nextInt(), num2 = input.nextInt();  // Get two numbers to add
        System.out.println("Sum = " + (num1 + num2));  // Print the sum
    }

    public static void Calc_Subtract(Scanner input) {
        int num1 = input.nextInt(), num2 = input.nextInt();  // Get two numbers to subtract
        System.out.println("Subtraction = " + (num1 - num2));  // Print the difference
    }

    public static void Calc_divid(Scanner input) {
        int num1 = input.nextInt(), num2 = input.nextInt();  // Get two numbers to divide
        if (num2 == 0) {
            System.out.println("Math Error: Division by zero is undefined.");  // Handle division by zero
        } else {
            System.out.println("Division = " + (num1 / (double) num2));  // Print the division result
        }
    }

    public static void Calc_Sqare(Scanner input) {
        int num = input.nextInt();  // Get a number to square
        System.out.println("Square = " + (num * num));  // Print the square of the number
    }

    public static void Calc_Sqart(Scanner input) {
        int num = input.nextInt();  // Get a number to find its square root
        if (num < 0) {
            System.out.println("Math Error: Square root of a negative number is undefined.");  // Handle negative input
        } else {
            System.out.println("Square Root = " + Math.sqrt(num));  // Print the square root
        }
    }

    public static void Trigonometric(Scanner input) {
        // Display the list of trigonometric functions for the user to choose from
        System.out.println("(1) Sin(x)");
        System.out.println("(2) Cos(x)");
        System.out.println("(3) Tan(x)");
        System.out.println("(4) Csc(x)");
        System.out.println("(5) Sec(x)");
        System.out.println("(6) Cot(x)");
        System.out.print("Choose a function: ");
        int option = input.nextInt();  // Get the selected function option

        System.out.print("Enter your angle in degrees: ");
        double x = input.nextDouble();  // Get the angle input
        double radians = Math.toRadians(x);  // Convert the angle to radians for trigonometric calculation

        // Switch case to calculate the corresponding trigonometric function
        switch (option) {
            case 1:
                System.out.println("Sin(" + x + ") = " + Math.sin(radians));
                break;

            case 2:
                System.out.println("Cos(" + x + ") = " + Math.cos(radians));
                break;

            case 3:
                if (Math.cos(radians) == 0) {
                    System.out.println("Math Error: Tan(" + x + ") is undefined.");  // Handle undefined value for tan(x)
                } else {
                    System.out.println("Tan(" + x + ") = " + Math.tan(radians));
                }
                break;

            case 4:
                if (Math.sin(radians) == 0) {
                    System.out.println("Math Error: Csc(" + x + ") is undefined.");  // Handle undefined value for csc(x)
                } else {
                    System.out.println("Csc(" + x + ") = " + (1 / Math.sin(radians)));
                }
                break;

            case 5:
                if (Math.cos(radians) == 0) {
                    System.out.println("Math Error: Sec(" + x + ") is undefined.");  // Handle undefined value for sec(x)
                } else {
                    System.out.println("Sec(" + x + ") = " + (1 / Math.cos(radians)));
                }
                break;

            case 6:
                if (Math.sin(radians) == 0) {
                    System.out.println("Math Error: Cot(" + x + ") is undefined.");  // Handle undefined value for cot(x)
                } else {
                    System.out.println("Cot(" + x + ") = " + (1 / Math.tan(radians)));
                }
                break;

            default:
                System.out.println("Invalid option, try again.");  // Handle invalid input
        }
    }

    public static void Power_Number(Scanner input) {
        System.out.println("Enter your number and power");
        int num = input.nextInt(), power = input.nextInt();  // Get the base and power for exponentiation
        System.out.println("Value = " + Math.pow(num, power));  // Calculate and print the result of num raised to the power
    }
}
