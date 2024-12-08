import java.util.Scanner; // Import the Scanner class to enable reading user input

// Define a class for calculating the average of grades
class Project2 {
   public static void main(String[] args) {
      Scanner pop = new Scanner(System.in); // Create a Scanner object named 'pop' for user input

      int grade = 0, sum = 0, counter = 1; // Initialize variables: 'grade' for input, 'sum' for total, and 'counter' for loop control

      while (counter <= 6 ) { 
         System.out.println("Calculate Average Of Grade & To Exit Enter(0)"); //Calculate average for 6 Student and Exit if user enter '0'
      // Start a while loop to read grades for 6 students

         // Prompt the user to enter a grade for the current student
         System.out.println("Enter Degree For Student " + "(" + counter + ")");
         grade = pop.nextInt(); // Read the grade input from the user
         if(grade ==0){
            System.out.println("Good Bye (:");// Check if the counter is 0 and display a goodbye message if true
            break;
         }
         sum += grade; // Add the entered grade to the total sum

         counter++; // Increment the counter to move to the next student
        }      
      // Calculate and display the average grade
      System.out.println("Average Grade is " + (sum / 6)); 
      // End of the main method
   // End of the class  
         }
  
      } 

